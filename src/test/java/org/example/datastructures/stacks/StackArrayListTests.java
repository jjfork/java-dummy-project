package org.example.datastructures.stacks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.EmptyStackException;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StackArrayListTests {

    @Test
    public void testPush() {
        StackArrayList stack = new StackArrayList();
        stack.push(1);
        assertEquals(1, stack.size());
    }

    @Test
    public void testPop() {
        StackArrayList stack = new StackArrayList();
        stack.push(1);
        int poppedValue = stack.pop();
        assertEquals(1, poppedValue);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPopEmptyStack() {
        StackArrayList stack = new StackArrayList();
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    public void testIsEmpty() {
        StackArrayList stack = new StackArrayList();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        StackArrayList stack = new StackArrayList();
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    public void testSize() {
        StackArrayList stack = new StackArrayList();
        assertEquals(0, stack.size());
        stack.push(1);
        assertEquals(1, stack.size());
    }
}