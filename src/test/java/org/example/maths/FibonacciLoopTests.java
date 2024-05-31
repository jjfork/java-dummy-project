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

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class FibonacciLoopTests {

    @Test
    public void testComputeWithNegativeInput() {
        IllegalArgumentException exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FibonacciLoop.compute(-1);
        });

        assertThat(exception.getMessage()).isEqualTo("Input 'n' must be a non-negative integer.");
    }

    @Test
    public void testComputeWithZeroInput() {
        BigInteger result = FibonacciLoop.compute(0);
        assertThat(result).isEqualTo(BigInteger.ZERO);
    }

    @Test
    public void testComputeWithOneInput() {
        BigInteger result = FibonacciLoop.compute(1);
        assertThat(result).isEqualTo(BigInteger.ONE);
    }

    @Test
    public void testComputeWithValidInput() {
        BigInteger result = FibonacciLoop.compute(5);
        assertThat(result).isEqualTo(BigInteger.valueOf(5));
    }
}
