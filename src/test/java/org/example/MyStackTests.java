package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.EmptyStackException;

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
        Object result = stack.pop();
        assertEquals(item, result);
    }

    @Test
    public void testPeek() {
        Object item = "Test";
        stack.push(item);
        Object result = stack.peek();
        assertEquals(item, result);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        Object item = "Test";
        stack.push(item);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPopEmptyStack() {
        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    public void testPeekEmptyStack() {
        assertThrows(EmptyStackException.class, () -> stack.peek());
    }
}