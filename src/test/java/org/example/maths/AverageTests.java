package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AverageTests {

    @Test
    public void testAverageDouble() {
        // Given
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};

        // When
        double result = Average.average(numbers);

        // Then
        assertThat(result).isEqualTo(3.0);
    }

    @Test
    public void testAverageDoubleEmptyArray() {
        // Given
        double[] numbers = {};

        // When/Then
        assertThrows(IllegalArgumentException.class, () -> Average.average(numbers));
    }

    @Test
    public void testAverageInt() {
        // Given
        int[] numbers = {1, 2, 3, 4, 5};

        // When
        int result = Average.average(numbers);

        // Then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void testAverageIntEmptyArray() {
        // Given
        int[] numbers = {};

        // When/Then
        assertThrows(IllegalArgumentException.class, () -> Average.average(numbers));
    }
}