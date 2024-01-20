package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyStackTests {

    MyStack stack;

    @BeforeEach
    public void setUp() {
        stack = new MyStack();
    }

    @Test
    public void testPushAndPop() {
        Object item = "Test";
        stack.push(item);
        Object poppedItem = stack.pop();
        assertEquals(item, poppedItem);
    }

    @Test
    public void testPeek() {
        Object item = "Test";
        stack.push(item);
        Object peekedItem = stack.peek();
        assertEquals(item, peekedItem);
    }

    @Test
    public void testIsEmptyWhenEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmptyWhenNotEmpty() {
        stack.push("Test");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPopEmptyStack() {
        assertThrows(NoSuchElementException.class, () -> stack.pop());
    }

    @Test
    public void testPeekEmptyStack() {
        assertThrows(NoSuchElementException.class, () -> stack.peek());
    }
}