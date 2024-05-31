package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
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
    public void testCalculateWithNullIndex() {
        assertThatThrownBy(() -> FibonacciJavaStreams.calculate(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Input index cannot be null or negative!");
    }

    @Test
    public void testCalculateWithNegativeIndex() {
        assertThatThrownBy(() -> FibonacciJavaStreams.calculate(BigDecimal.valueOf(-1)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Input index cannot be null or negative!");
    }

    @Test
    public void testCalculateWithIndexZero() {
        Optional<BigDecimal> result = FibonacciJavaStreams.calculate(BigDecimal.ZERO);
        assertThat(result).isPresent().contains(BigDecimal.ZERO);
    }

    @Test
    public void testCalculateWithIndexOne() {
        Optional<BigDecimal> result = FibonacciJavaStreams.calculate(BigDecimal.ONE);
        assertThat(result).isPresent().contains(BigDecimal.ONE);
    }

    @Test
    public void testCalculateWithIndexTwo() {
        Optional<BigDecimal> result = FibonacciJavaStreams.calculate(BigDecimal.valueOf(2));
        assertThat(result).isPresent().contains(BigDecimal.ONE);
    }

    @Test
    public void testCalculateWithIndexThree() {
        Optional<BigDecimal> result = FibonacciJavaStreams.calculate(BigDecimal.valueOf(3));
        assertThat(result).isPresent().contains(BigDecimal.valueOf(2));
    }

    @Test
    public void testCalculateWithIndexTen() {
        Optional<BigDecimal> result = FibonacciJavaStreams.calculate(BigDecimal.TEN);
        assertThat(result).isPresent().contains(BigDecimal.valueOf(55));
    }
}