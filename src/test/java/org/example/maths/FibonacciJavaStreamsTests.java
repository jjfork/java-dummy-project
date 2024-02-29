package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class FibonacciJavaStreamsTests {

    @Test
    public void testCalculateWithValidIndex() {
        // Arrange
        BigDecimal index = new BigDecimal(5);
        FibonacciJavaStreams fibonacciJavaStreams = new FibonacciJavaStreams();

        // Act
        Optional<BigDecimal> result = fibonacciJavaStreams.calculate(index);

        // Assert
        assertThat(result).isPresent().contains(new BigDecimal(5));
    }

    @Test
    public void testCalculateWithZeroIndex() {
        // Arrange
        BigDecimal index = BigDecimal.ZERO;
        FibonacciJavaStreams fibonacciJavaStreams = new FibonacciJavaStreams();

        // Act
        Optional<BigDecimal> result = fibonacciJavaStreams.calculate(index);

        // Assert
        assertThat(result).isPresent().contains(BigDecimal.ZERO);
    }

    @Test
    public void testCalculateWithNegativeIndex() {
        // Arrange
        BigDecimal index = new BigDecimal(-1);
        FibonacciJavaStreams fibonacciJavaStreams = new FibonacciJavaStreams();

        // Act and Assert
        IllegalArgumentException exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            fibonacciJavaStreams.calculate(index);
        });
        assertThat(exception.getMessage()).isEqualTo("Input index cannot be null or negative!");
    }

    @Test
    public void testCalculateWithNullIndex() {
        // Arrange
        FibonacciJavaStreams fibonacciJavaStreams = new FibonacciJavaStreams();

        // Act and Assert
        IllegalArgumentException exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            fibonacciJavaStreams.calculate(null);
        });
        assertThat(exception.getMessage()).isEqualTo("Input index cannot be null or negative!");
    }
}