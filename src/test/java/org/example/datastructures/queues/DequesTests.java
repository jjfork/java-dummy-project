package org.example.datastructures.queues;

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
public class DequesTests {

    @Test
    public void testAddFirst() {
        Deques<Integer> deque = new Deques<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        assertThat(deque.size()).isEqualTo(3);
        assertThat(deque.peekFirst()).isEqualTo(3);
        assertThat(deque.peekLast()).isEqualTo(1);
    }

    @Test
    public void testAddLast() {
        Deques<String> deque = new Deques<>();
        deque.addLast("first");
        deque.addLast("second");
        deque.addLast("third");

        assertThat(deque.size()).isEqualTo(3);
        assertThat(deque.peekFirst()).isEqualTo("first");
        assertThat(deque.peekLast()).isEqualTo("third");
    }

    @Test
    public void testPollFirst() {
        Deques<Integer> deque = new Deques<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        assertThat(deque.pollFirst()).isEqualTo(3);
        assertThat(deque.size()).isEqualTo(2);
        assertThat(deque.peekFirst()).isEqualTo(2);
    }

    @Test
    public void testPollLast() {
        Deques<String> deque = new Deques<>();
        deque.addLast("first");
        deque.addLast("second");
        deque.addLast("third");

        assertThat(deque.pollLast()).isEqualTo("third");
        assertThat(deque.size()).isEqualTo(2);
        assertThat(deque.peekLast()).isEqualTo("second");
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
        deque.addLast(3);

        assertThat(deque.toString()).isEqualTo("Head -> 1 <-> 2 <-> 3 <- Tail");
    }
}