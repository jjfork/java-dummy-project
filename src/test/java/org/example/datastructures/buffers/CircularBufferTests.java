package org.example.datastructures.buffers;

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
public class CircularBufferTests {

    @Test
    public void testIsEmpty() {
        CircularBuffer<Integer> circularBuffer = new CircularBuffer<>(5);
        assertThat(circularBuffer.isEmpty()).isTrue();
    }

    @Test
    public void testIsFull() {
        CircularBuffer<Integer> circularBuffer = new CircularBuffer<>(2);
        circularBuffer.put(1);
        circularBuffer.put(2);
        assertThat(circularBuffer.isFull()).isTrue();
    }

    @Test
    public void testGet() {
        CircularBuffer<Integer> circularBuffer = new CircularBuffer<>(3);
        circularBuffer.put(1);
        circularBuffer.put(2);
        assertThat(circularBuffer.get()).isEqualTo(1);
    }

    @Test
    public void testPut() {
        CircularBuffer<Integer> circularBuffer = new CircularBuffer<>(2);
        assertThat(circularBuffer.put(1)).isTrue();
    }
}
