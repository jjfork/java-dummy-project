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
public class GenericArrayListQueueTests {

    @Test
    public void testPeekWhenQueueIsEmpty() {
        GenericArrayListQueue<String> queue = new GenericArrayListQueue<>();
        
        assertThat(queue.peek()).isNull();
    }

    @Test
    public void testPeekWhenQueueHasElements() {
        GenericArrayListQueue<String> queue = new GenericArrayListQueue<>();
        queue.add("element1");
        queue.add("element2");

        assertThat(queue.peek()).isEqualTo("element1");
    }

    @Test
    public void testAddElementToQueue() {
        GenericArrayListQueue<String> queue = new GenericArrayListQueue<>();
        
        assertThat(queue.add("element")).isTrue();
    }

    @Test
    public void testPullWhenQueueIsEmpty() {
        GenericArrayListQueue<String> queue = new GenericArrayListQueue<>();
        
        assertThat(queue.pull()).isNull();
    }

    @Test
    public void testPullWhenQueueHasElements() {
        GenericArrayListQueue<String> queue = new GenericArrayListQueue<>();
        queue.add("element1");
        queue.add("element2");

        assertThat(queue.pull()).isEqualTo("element1");
    }
}