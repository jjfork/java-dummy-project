package org.example.datastructures.stacks;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StackArrayTests {

    @Test
    public void testPush() {
        StackArray stack = new StackArray(5);
        stack.push(1);
        assertThat(stack.peek()).isEqualTo(1);
    }

    @Test
    public void testPop() {
        StackArray stack = new StackArray(5);
        stack.push(1);
        assertThat(stack.pop()).isEqualTo(1);
    }

    @Test
    public void testPeek() {
        StackArray stack = new StackArray(5);
        stack.push(1);
        assertThat(stack.peek()).isEqualTo(1);
    }

    @Test
    public void testIsEmpty() {
        StackArray stack = new StackArray(5);
        assertThat(stack.isEmpty()).isTrue();
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
        StackArray stack = new StackArray(5);
        stack.push(1);
        stack.makeEmpty();
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    public void testSize() {
        StackArray stack = new StackArray(5);
        stack.push(1);
        assertThat(stack.size()).isEqualTo(1);
    }
}
