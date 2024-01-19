package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyStackTests {

    private MyStack stack;

    @BeforeEach
    public void setUp() {
        stack = new MyStack();
    }

    @Test
    public void testPush() {
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPop() {
        stack.push(1);
        Object result = stack.pop();
        assertEquals(1, result);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPopEmptyStack() {
        assertThrows(NoSuchElementException.class, () -> stack.pop());
    }

    @Test
    public void testPeek() {
        stack.push(1);
        Object result = stack.peek();
        assertEquals(1, result);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPeekEmptyStack() {
        assertThrows(NoSuchElementException.class, () -> stack.peek());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testEnsureCapacity() {
        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }
        assertFalse(stack.isEmpty());
    }
}