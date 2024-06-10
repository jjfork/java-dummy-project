package org.example.datastructures.stacks;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StackArrayTests {

    private StackArray stack;

    @BeforeEach
    public void setUp() {
        stack = new StackArray(5);
    }

    @Test
    public void testPush() {
        stack.push(1);
        assertThat(stack.size()).isEqualTo(1);
    }

    @Test
    public void testPop() {
        stack.push(1);
        int poppedValue = stack.pop();
        assertThat(poppedValue).isEqualTo(1);
        assertThat(stack.size()).isZero();
    }

    @Test
    public void testPeek() {
        stack.push(1);
        int peekedValue = stack.peek();
        assertThat(peekedValue).isEqualTo(1);
        assertThat(stack.size()).isEqualTo(1);
    }

    @Test
    public void testIsEmpty() {
        assertThat(stack.isEmpty()).isTrue();
        stack.push(1);
        assertThat(stack.isEmpty()).isFalse();
    }

    @Test
    public void testIsFull() {
        StackArray stack = new StackArray(2);
        stack.push(1);
        stack.push(2);
        assertThat(stack.isFull()).isTrue();
    }

    @Test
    public void testMakeEmpty() {
        stack.push(1);
        stack.makeEmpty();
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    public void testSize() {
        stack.push(1);
        stack.push(2);
        assertThat(stack.size()).isEqualTo(2);
    }
}