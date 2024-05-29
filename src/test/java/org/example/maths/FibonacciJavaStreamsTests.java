package org.example.maths;

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

import java.math.BigDecimal;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FibonacciJavaStreamsTests {

    @Test
    public void testCalculate_withIndexZero_shouldReturnZero() {
        Optional<BigDecimal> result = FibonacciJavaStreams.calculate(BigDecimal.ZERO);
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(BigDecimal.ZERO);
    }

    @Test
    public void testCalculate_withIndexOne_shouldReturnOne() {
        Optional<BigDecimal> result = FibonacciJavaStreams.calculate(BigDecimal.ONE);
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(BigDecimal.ONE);
    }

    @Test
    public void testCalculate_withIndexTwo_shouldReturnOne() {
        Optional<BigDecimal> result = FibonacciJavaStreams.calculate(new BigDecimal(2));
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(BigDecimal.ONE);
    }

    @Test
    public void testCalculate_withIndexThree_shouldReturnTwo() {
        Optional<BigDecimal> result = FibonacciJavaStreams.calculate(new BigDecimal(3));
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(new BigDecimal(2));
    }

    @Test
    public void testCalculate_withNegativeIndex_shouldThrowIllegalArgumentException() {
        assertThatThrownBy(() -> FibonacciJavaStreams.calculate(new BigDecimal(-1)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Input index cannot be null or negative!");
    }
}
