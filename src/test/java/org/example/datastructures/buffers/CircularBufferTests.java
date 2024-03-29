package org.example.datastructures.buffers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CircularBufferTests {

    @Test
    public void testIsEmpty_whenBufferIsEmpty_thenReturnTrue() {
        // Arrange
        CircularBuffer<Integer> buffer = new CircularBuffer<>(5);

        // Act
        boolean result = buffer.isEmpty();

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testIsFull_whenBufferIsFull_thenReturnTrue() {
        // Arrange
        CircularBuffer<String> buffer = new CircularBuffer<>(3);
        buffer.put("A");
        buffer.put("B");
        buffer.put("C");

        // Act
        boolean result = buffer.isFull();

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testGet_whenBufferIsNotEmpty_thenReturnItem() {
        // Arrange
        CircularBuffer<String> buffer = new CircularBuffer<>(3);
        buffer.put("A");
        buffer.put("B");

        // Act
        String result = buffer.get();

        // Assert
        assertThat(result).isEqualTo("A");
    }

    @Test
    public void testPut_whenBufferIsNotFull_thenReturnTrue() {
        // Arrange
        CircularBuffer<Integer> buffer = new CircularBuffer<>(2);

        // Act
        boolean result = buffer.put(10);

        // Assert
        assertThat(result).isTrue();
    }
}