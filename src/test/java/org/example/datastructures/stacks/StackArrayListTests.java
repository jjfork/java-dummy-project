package org.example.datastructures.stacks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StackArrayListTests {

    @Test
    public void testPush() {
        StackArrayList stack = new StackArrayList();
        stack.push(1);
        assertThat(stack.size()).isEqualTo(1);
    }

    @Test
    public void testPop() {
        StackArrayList stack = new StackArrayList();
        stack.push(1);
        int poppedValue = stack.pop();
        assertThat(poppedValue).isEqualTo(1);
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    public void testPeek() {
        StackArrayList stack = new StackArrayList();
        stack.push(1);
        assertThat(stack.peek()).isEqualTo(1);
    }

    @Test
    public void testIsEmpty() {
        StackArrayList stack = new StackArrayList();
        assertThat(stack.isEmpty()).isTrue();
        stack.push(1);
        assertThat(stack.isEmpty()).isFalse();
    }

    @Test
    public void testSize() {
        StackArrayList stack = new StackArrayList();
        assertThat(stack.size()).isEqualTo(0);
        stack.push(1);
        assertThat(stack.size()).isEqualTo(1);
    }
}