package org.example.datastructures.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class QueuesTests {

    private Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue(5);
    }

    @Test
    void testInsert() {
        queue.insert(1);
        queue.insert(2);
        assertEquals(2, queue.getSize());
    }

    @Test
    void testRemove() {
        queue.insert(1);
        queue.insert(2);
        int removed = queue.remove();
        assertEquals(1, removed);
    }

    @Test
    void testPeekFront() {
        queue.insert(1);
        queue.insert(2);
        assertEquals(1, queue.peekFront());
    }

    @Test
    void testPeekRear() {
        queue.insert(1);
        queue.insert(2);
        assertEquals(2, queue.peekRear());
    }

    @Test
    void testIsEmpty() {
        assertThat(queue.isEmpty()).isTrue();
        queue.insert(1);
        assertThat(queue.isEmpty()).isFalse();
    }

    @Test
    void testIsFull() {
        assertThat(queue.isFull()).isFalse();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        assertThat(queue.isFull()).isTrue();
    }

    @Test
    void testGetSize() {
        queue.insert(1);
        queue.insert(2);
        assertEquals(2, queue.getSize());
    }
}