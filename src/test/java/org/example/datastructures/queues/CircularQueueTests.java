package org.example.datastructures.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
public class CircularQueueTests {

    private CircularQueue queue;

    @BeforeEach
    public void setUp() {
        queue = new CircularQueue(5);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsFull() {
        assertFalse(queue.isFull());
    }

    @Test
    public void testEnQueue() {
        queue.enQueue(10);
        assertEquals(10, queue.peek());
    }

    @Test
    public void testDeQueue() {
        queue.enQueue(20);
        assertEquals(20, queue.deQueue());
    }

    @Test
    public void testPeek() {
        queue.enQueue(30);
        assertEquals(30, queue.peek());
    }

    @Test
    public void testDeleteQueue() {
        queue.deleteQueue();
        assertTrue(queue.isEmpty());
    }
}