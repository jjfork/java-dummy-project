package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class FibonacciJavaStreamsTests {

    @Test
    public void testCalculate_withValidIndex_shouldReturnResult() {
        // Arrange
        BigDecimal index = new BigDecimal(5);
        Optional<BigDecimal> expectedResult = Optional.of(new BigDecimal(5));

        // Act
        Optional<BigDecimal> result = FibonacciJavaStreams.calculate(index);

        // Assert
        assertThat(result).isPresent();
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void testCalculate_withZeroIndex_shouldReturnZero() {
        // Arrange
        BigDecimal index = BigDecimal.ZERO;
        Optional<BigDecimal> expectedResult = Optional.of(BigDecimal.ZERO);

        // Act
        Optional<BigDecimal> result = FibonacciJavaStreams.calculate(index);

        // Assert
        assertThat(result).isPresent();
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void testCalculate_withNegativeIndex_shouldThrowException() {
        // Arrange
        BigDecimal index = new BigDecimal(-1);

        // Act & Assert
        assertThatThrownBy(() -> FibonacciJavaStreams.calculate(index))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Input index cannot be null or negative!");
    }
}