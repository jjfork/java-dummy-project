package org.example.datastructures.queues;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DequesTests {

    @Test
    public void testAddFirst() {
        Deques<Integer> deque = new Deques<>();
        deque.addFirst(1);
        assertThat(deque.peekFirst()).isEqualTo(1);
    }

    @Test
    public void testAddLast() {
        Deques<Integer> deque = new Deques<>();
        deque.addLast(2);
        assertThat(deque.peekLast()).isEqualTo(2);
    }

    @Test
    public void testPollFirst() {
        Deques<Integer> deque = new Deques<>();
        deque.addFirst(1);
        assertThat(deque.pollFirst()).isEqualTo(1);
    }

    @Test
    public void testPollLast() {
        Deques<Integer> deque = new Deques<>();
        deque.addLast(2);
        assertThat(deque.pollLast()).isEqualTo(2);
    }

    @Test
    public void testPeekFirst() {
        Deques<Integer> deque = new Deques<>();
        deque.addFirst(1);
        assertThat(deque.peekFirst()).isEqualTo(1);
    }

    @Test
    public void testPeekLast() {
        Deques<Integer> deque = new Deques<>();
        deque.addLast(2);
        assertThat(deque.peekLast()).isEqualTo(2);
    }

    @Test
    public void testSize() {
        Deques<Integer> deque = new Deques<>();
        deque.addFirst(1);
        deque.addLast(2);
        assertThat(deque.size()).isEqualTo(2);
    }

    @Test
    public void testIsEmpty() {
        Deques<Integer> deque = new Deques<>();
        assertThat(deque.isEmpty()).isTrue();
        deque.addFirst(1);
        assertThat(deque.isEmpty()).isFalse();
    }

    @Test
    public void testToString() {
        Deques<Integer> deque = new Deques<>();
        deque.addFirst(1);
        deque.addLast(2);
        assertThat(deque.toString()).isEqualTo("Head -> 1 <-> 2 <- Tail");
    }
}
