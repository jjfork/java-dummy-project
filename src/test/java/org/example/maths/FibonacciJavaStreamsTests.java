package org.example.maths;

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

import java.math.BigDecimal;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@ExtendWith(MockitoExtension.class)
public class FibonacciJavaStreamsTests {

    @Test
    void testCalculateWithNullIndex() {
        assertThatThrownBy(() -> FibonacciJavaStreams.calculate(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Input index cannot be null or negative!");
    }

    @Test
    void testCalculateWithNegativeIndex() {
        assertThatThrownBy(() -> FibonacciJavaStreams.calculate(new BigDecimal(-1)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Input index cannot be null or negative!");
    }

    @Test
    void testCalculateWithIndexZero() {
        Optional<BigDecimal> result = FibonacciJavaStreams.calculate(BigDecimal.ZERO);
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(BigDecimal.ZERO);
    }

    @Test
    void testCalculateWithIndexOne() {
        Optional<BigDecimal> result = FibonacciJavaStreams.calculate(BigDecimal.ONE);
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(BigDecimal.ONE);
    }

    @Test
    void testCalculateWithIndexTwo() {
        Optional<BigDecimal> result = FibonacciJavaStreams.calculate(new BigDecimal(2));
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(BigDecimal.ONE);
    }

    // Add more test cases as needed
}
