package org.example.datastructures.queues;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class QueuesTests {

    @Test
    void testInsert() {
        Queue queue = new Queue(5);
        queue.insert(10);
        assertThat(queue.getSize()).isEqualTo(1);
    }

    @Test
    void testRemove() {
        Queue queue = new Queue(5);
        queue.insert(10);
        int removed = queue.remove();
        assertThat(removed).isEqualTo(10);
        assertThat(queue.getSize()).isZero();
    }

    @Test
    void testPeekFront() {
        Queue queue = new Queue(5);
        queue.insert(10);
        assertThat(queue.peekFront()).isEqualTo(10);
    }

    @Test
    void testPeekRear() {
        Queue queue = new Queue(5);
        queue.insert(10);
        assertThat(queue.peekRear()).isEqualTo(10);
    }

    @Test
    void testIsEmpty() {
        Queue queue = new Queue(5);
        assertThat(queue.isEmpty()).isTrue();
        queue.insert(10);
        assertThat(queue.isEmpty()).isFalse();
    }

    @Test
    void testIsFull() {
        Queue queue = new Queue(2);
        queue.insert(10);
        queue.insert(20);
        assertThat(queue.isFull()).isTrue();
    }

    @Test
    void testToString() {
        Queue queue = new Queue(3);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        assertThat(queue.toString()).isEqualTo("[10, 20, 30]");
    }
}