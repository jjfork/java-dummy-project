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
public class GenericArrayListQueueTests {

    @Test
    public void testPeek() {
        GenericArrayListQueue<Integer> queue = new GenericArrayListQueue<>();
        queue.add(1);
        assertThat(queue.peek()).isEqualTo(1);
    }

    @Test
    public void testAdd() {
        GenericArrayListQueue<String> queue = new GenericArrayListQueue<>();
        queue.add("test");
        assertThat(queue.peek()).isEqualTo("test");
    }

    @Test
    public void testPull() {
        GenericArrayListQueue<Double> queue = new GenericArrayListQueue<>();
        queue.add(3.14);
        assertThat(queue.pull()).isEqualTo(3.14);
    }

    @Test
    public void testPullEmptyQueue() {
        GenericArrayListQueue<Boolean> queue = new GenericArrayListQueue<>();
        assertThat(queue.pull()).isNull();
    }
}
