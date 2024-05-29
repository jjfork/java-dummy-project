package org.example.datastructures.queues;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DequesTests {

    @Test
    public void testAddFirst() {
        Deques<Integer> deques = new Deques<>();
        deques.addFirst(1);
        assertThat(deques.peekFirst()).isEqualTo(1);
    }

    @Test
    public void testAddLast() {
        Deques<Integer> deques = new Deques<>();
        deques.addLast(2);
        assertThat(deques.peekLast()).isEqualTo(2);
    }

    @Test
    public void testPollFirst() {
        Deques<Integer> deques = new Deques<>();
        deques.addFirst(1);
        assertThat(deques.pollFirst()).isEqualTo(1);
    }

    @Test
    public void testPollLast() {
        Deques<Integer> deques = new Deques<>();
        deques.addLast(2);
        assertThat(deques.pollLast()).isEqualTo(2);
    }

    @Test
    public void testPeekFirst() {
        Deques<Integer> deques = new Deques<>();
        deques.addFirst(1);
        assertThat(deques.peekFirst()).isEqualTo(1);
    }

    @Test
    public void testPeekLast() {
        Deques<Integer> deques = new Deques<>();
        deques.addLast(2);
        assertThat(deques.peekLast()).isEqualTo(2);
    }

    @Test
    public void testSize() {
        Deques<Integer> deques = new Deques<>();
        deques.addFirst(1);
        deques.addLast(2);
        assertThat(deques.size()).isEqualTo(2);
    }

    @Test
    public void testIsEmpty() {
        Deques<Integer> deques = new Deques<>();
        assertThat(deques.isEmpty()).isTrue();
        deques.addFirst(1);
        assertThat(deques.isEmpty()).isFalse();
    }

    @Test
    public void testToString() {
        Deques<Integer> deques = new Deques<>();
        deques.addFirst(1);
        deques.addLast(2);
        assertThat(deques.toString()).isEqualTo("Head -> 1 <-> 2 <- Tail");
    }
}
