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
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LinkedQueueTests {

    @Test
    void testEnqueueAndDequeue() {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    void testPeekFront() {
        LinkedQueue<String> queue = new LinkedQueue<>();
        queue.enqueue("first");
        queue.enqueue("second");

        assertEquals("first", queue.peekFront());
    }

    @Test
    void testPeekRear() {
        LinkedQueue<String> queue = new LinkedQueue<>();
        queue.enqueue("first");
        queue.enqueue("second");

        assertEquals("second", queue.peekRear());
    }

    @Test
    void testPeek() {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        assertEquals(10, queue.peek(1));
        assertEquals(20, queue.peek(2));
        assertEquals(30, queue.peek(3));
    }

    @Test
    void testSize() {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(3, queue.size());
    }

    @Test
    void testClear() {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.clear();

        assertTrue(queue.isEmpty());
    }

    @Test
    void testIterator() {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        StringBuilder sb = new StringBuilder();
        for (Integer num : queue) {
            sb.append(num);
        }

        assertThat(sb.toString()).isEqualTo("123");
    }

    @Test
    void testToString() {
        LinkedQueue<String> queue = new LinkedQueue<>();
        queue.enqueue("first");
        queue.enqueue("second");

        assertThat(queue.toString()).isEqualTo("[first, second]");
    }
}