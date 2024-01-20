package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ArrayDequeTests {

    @Test
    public void testAddFirst() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        assertThat(deque.getFirst()).isEqualTo(5);
    }

    @Test
    public void testAddLast() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(10);
        assertThat(deque.getLast()).isEqualTo(10);
    }

    @Test
    public void testRemoveFirst() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(15);
        assertThat(deque.removeFirst()).isEqualTo(15);
    }

    @Test
    public void testRemoveLast() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(20);
        assertThat(deque.removeLast()).isEqualTo(20);
    }

    @Test
    public void testGetFirst() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(25);
        assertThat(deque.getFirst()).isEqualTo(25);
    }

    @Test
    public void testGetLast() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(30);
        assertThat(deque.getLast()).isEqualTo(30);
    }
}