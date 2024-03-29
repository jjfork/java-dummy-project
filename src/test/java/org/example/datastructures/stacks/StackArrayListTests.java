package org.example.datastructures.stacks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Duration;
import java.util.EmptyStackException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StackArrayListTests {

    @Test
    public void testIsEmpty() {
        assertTimeoutPreemptively(Duration.ofMillis(50), () -> {
            StackArrayList stack = new StackArrayList();
            assertTrue(stack.isEmpty());
        });
    }

    @Test
    public void testPushAndSize() {
        assertTimeoutPreemptively(Duration.ofMillis(50), () -> {
            StackArrayList stack = new StackArrayList();
            for (int i = 1; i <= 5; ++i) {
                stack.push(i);
                assertEquals(stack.size(), i);
            }
        });
    }

    @Test
    public void testPopAndPeek() {
        assertTimeoutPreemptively(Duration.ofMillis(50), () -> {
            StackArrayList stack = new StackArrayList();
            for (int i = 1; i <= 5; ++i) {
                stack.push(i);
            }
            assertEquals(stack.size(), 5);
            assertEquals(stack.peek(), 5);
            assertEquals(stack.pop(), 5);
            assertEquals(stack.peek(), 4);
        });
    }

    @Test
    public void testPopWhenEmpty() {
        assertTimeoutPreemptively(Duration.ofMillis(50), () -> {
            StackArrayList stack = new StackArrayList();
            assertTrue(stack.isEmpty());
            assertThrows(EmptyStackException.class, () -> stack.pop());
        });
    }
}