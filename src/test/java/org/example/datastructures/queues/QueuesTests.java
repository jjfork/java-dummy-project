package org.example.datastructures.queues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class QueuesTests {

    @Test
    void testInsert() {
        Queue queue = new Queue(5);
        assertTrue(queue.insert(1));
        assertEquals(1, queue.getSize());
    }

    @Test
    void testRemove() {
        Queue queue = new Queue(5);
        queue.insert(1);
        assertEquals(1, queue.remove());
        assertEquals(0, queue.getSize());
    }

    @Test
    void testPeekFront() {
        Queue queue = new Queue(5);
        queue.insert(1);
        assertEquals(1, queue.peekFront());
    }

    @Test
    void testPeekRear() {
        Queue queue = new Queue(5);
        queue.insert(1);
        assertEquals(1, queue.peekRear());
    }

    @Test
    void testIsEmpty() {
        Queue queue = new Queue(5);
        assertTrue(queue.isEmpty());
    }

    @Test
    void testIsFull() {
        Queue queue = new Queue(2);
        queue.insert(1);
        queue.insert(2);
        assertTrue(queue.isFull());
    }

    @Test
    void testGetSize() {
        Queue queue = new Queue(5);
        queue.insert(1);
        assertEquals(1, queue.getSize());
    }

    @Test
    void testToString() {
        Queue queue = new Queue(5);
        queue.insert(1);
        queue.insert(2);
        assertEquals("[1, 2]", queue.toString());
    }
}