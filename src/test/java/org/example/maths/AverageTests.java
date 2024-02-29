package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class AverageTests {

    @Test
    public void testAverage_doubleArray() {
        // Arrange
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};

        // Act
        double result = Average.average(numbers);

        // Assert
        assertThat(result).isEqualTo(3.0);
    }

    @Test
    public void testAverage_intArray() {
        // Arrange
        int[] numbers = {1, 2, 3, 4, 5};

        // Act
        int result = Average.average(numbers);

        // Assert
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void testAverage_nullArray() {
        // Arrange
        int[] numbers = null;

        // Act and Assert
        assertThatThrownBy(() -> Average.average(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Numbers array cannot be empty or null");
    }

    @Test
    public void testAverage_emptyArray() {
        // Arrange
        int[] numbers = {};

        // Act and Assert
        assertThatThrownBy(() -> Average.average(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Numbers array cannot be empty or null");
    }
}