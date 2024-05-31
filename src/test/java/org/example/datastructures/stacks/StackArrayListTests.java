package org.example.datastructures.stacks;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.EmptyStackException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        assertThat(stack.size()).isZero();
    }

    @Test
    public void testPopEmptyStack() {
        StackArrayList stack = new StackArrayList();
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    public void testIsEmpty() {
        StackArrayList stack = new StackArrayList();
        assertThat(stack.isEmpty()).isTrue();
        stack.push(1);
        assertThat(stack.isEmpty()).isFalse();
    }

    @Test
    public void testPeek() {
        StackArrayList stack = new StackArrayList();
        stack.push(1);
        assertThat(stack.peek()).isEqualTo(1);
    }

    @Test
    public void testPeekEmptyStack() {
        StackArrayList stack = new StackArrayList();
        assertThrows(EmptyStackException.class, stack::peek);
    }

    @Test
    public void testSize() {
        StackArrayList stack = new StackArrayList();
        assertThat(stack.size()).isZero();
        stack.push(1);
        assertThat(stack.size()).isEqualTo(1);
    }
}
