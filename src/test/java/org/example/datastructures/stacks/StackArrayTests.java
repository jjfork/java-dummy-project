package org.example.datastructures.stacks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StackArrayTests {

    @Test
    public void testPush() {
        StackArray stack = new StackArray(5);
        stack.push(10);
        assertThat(stack.size()).isEqualTo(1);
    }

    @Test
    public void testPop() {
        StackArray stack = new StackArray(5);
        stack.push(10);
        int result = stack.pop();
        assertThat(result).isEqualTo(10);
        assertThat(stack.size()).isZero();
    }

    @Test
    public void testPeek() {
        StackArray stack = new StackArray(5);
        stack.push(10);
        int result = stack.peek();
        assertThat(result).isEqualTo(10);
        assertThat(stack.size()).isEqualTo(1);
    }

    @Test
    public void testIsEmpty() {
        StackArray stack = new StackArray(5);
        boolean result = stack.isEmpty();
        assertThat(result).isTrue();
    }

    @Test
    public void testIsFull() {
        StackArray stack = new StackArray(2);
        stack.push(10);
        stack.push(20);
        boolean result = stack.isFull();
        assertThat(result).isTrue();
    }

    @Test
    public void testMakeEmpty() {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.makeEmpty();
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    public void testSize() {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        int result = stack.size();
        assertThat(result).isEqualTo(2);
    }
}