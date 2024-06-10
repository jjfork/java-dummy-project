package org.example.datastructures.buffers;

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
public class CircularBufferTests {

    @Test
    public void testIsEmpty() {
        CircularBuffer<Integer> circularBuffer = new CircularBuffer<>(5);
        assertThat(circularBuffer.isEmpty()).isTrue();

        circularBuffer.put(1);
        assertThat(circularBuffer.isEmpty()).isFalse();
    }

    @Test
    public void testIsFull() {
        CircularBuffer<String> circularBuffer = new CircularBuffer<>(3);
        assertThat(circularBuffer.isFull()).isFalse();

        circularBuffer.put("A");
        circularBuffer.put("B");
        circularBuffer.put("C");
        assertThat(circularBuffer.isFull()).isTrue();
    }

    @Test
    public void testGetAndPut() {
        CircularBuffer<String> circularBuffer = new CircularBuffer<>(2);
        circularBuffer.put("A");
        circularBuffer.put("B");

        assertThat(circularBuffer.get()).isEqualTo("A");
        assertThat(circularBuffer.get()).isEqualTo("B");
        assertThat(circularBuffer.get()).isNull();
    }

    @Test
    public void testPutWhenFull() {
        CircularBuffer<Integer> circularBuffer = new CircularBuffer<>(2);
        circularBuffer.put(1);
        circularBuffer.put(2);

        assertThat(circularBuffer.put(3)).isFalse();
    }

    @Test
    public void testGetWhenEmpty() {
        CircularBuffer<String> circularBuffer = new CircularBuffer<>(3);

        assertThat(circularBuffer.get()).isNull();
    }
}
