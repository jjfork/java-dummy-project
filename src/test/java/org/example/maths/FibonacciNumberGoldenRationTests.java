package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FibonacciNumberGoldenRationTests {

    @Test
    public void testCompute_WhenNIs0_ThenReturn0() {
        // Arrange
        int n = 0;

        // Act
        long result = FibonacciNumberGoldenRation.compute(n);

        // Assert
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testCompute_WhenNIs1_ThenReturn1() {
        // Arrange
        int n = 1;

        // Act
        long result = FibonacciNumberGoldenRation.compute(n);

        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testCompute_WhenNIs5_ThenReturn5() {
        // Arrange
        int n = 5;

        // Act
        long result = FibonacciNumberGoldenRation.compute(n);

        // Assert
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testCompute_WhenNIsNegative_ThenThrowIllegalArgumentException() {
        // Arrange
        int n = -1;

        // Act & Assert
        assertThatThrownBy(() -> FibonacciNumberGoldenRation.compute(n))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Input 'n' must be a non-negative integer.");
    }

    @Test
    public void testCompute_WhenNIsTooBig_ThenThrowIllegalArgumentException() {
        // Arrange
        int n = 71;

        // Act & Assert
        assertThatThrownBy(() -> FibonacciNumberGoldenRation.compute(n))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Input 'n' is too big to give accurate result.");
    }
}