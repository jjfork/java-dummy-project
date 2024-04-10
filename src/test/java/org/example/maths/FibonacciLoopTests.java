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

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@ExtendWith(MockitoExtension.class)
public class FibonacciLoopTests {

    @Test
    public void testComputeWithNegativeInput() {
        assertThatThrownBy(() -> FibonacciLoop.compute(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Input 'n' must be a non-negative integer.");
    }

    @Test
    public void testComputeWithZeroInput() {
        assertThat(FibonacciLoop.compute(0)).isEqualTo(BigInteger.ZERO);
    }

    @Test
    public void testComputeWithOneInput() {
        assertThat(FibonacciLoop.compute(1)).isEqualTo(BigInteger.ONE);
    }

    @Test
    public void testComputeWithValidInput() {
        assertThat(FibonacciLoop.compute(5)).isEqualTo(BigInteger.valueOf(5));
    }
}
