package org.example.datastructures.stacks;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.EmptyStackException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class StackArrayListTests {

    @Test
    public void testPushAndPop() {
        StackArrayList stack = new StackArrayList();
        stack.push(1);
        stack.push(2);
        assertThat(stack.pop()).isEqualTo(2);
        assertThat(stack.pop()).isEqualTo(1);
    }

    @Test
    public void testPeek() {
        StackArrayList stack = new StackArrayList();
        stack.push(1);
        stack.push(2);
        assertThat(stack.peek()).isEqualTo(2);
        assertThat(stack.size()).isEqualTo(2);
    }

    @Test
    public void testEmptyStackException() {
        StackArrayList stack = new StackArrayList();
        assertThrows(EmptyStackException.class, stack::pop);
        assertThrows(EmptyStackException.class, stack::peek);
    }

    @Test
    public void testIsEmpty() {
        StackArrayList stack = new StackArrayList();
        assertThat(stack.isEmpty()).isTrue();
        stack.push(1);
        assertThat(stack.isEmpty()).isFalse();
        stack.pop();
        assertThat(stack.isEmpty()).isTrue();
    }
}