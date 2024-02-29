package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import java.math.BigInteger;

@ExtendWith(MockitoExtension.class)
public class FibonacciLoopTests {

    @Test
    public void testCompute_WhenNIsZero_ThenReturnZero() {
        // Arrange
        int n = 0;

        // Act
        BigInteger result = FibonacciLoop.compute(n);

        // Assert
        assertThat(result).isEqualTo(BigInteger.ZERO);
    }

    @Test
    public void testCompute_WhenNIsOne_ThenReturnOne() {
        // Arrange
        int n = 1;

        // Act
        BigInteger result = FibonacciLoop.compute(n);

        // Assert
        assertThat(result).isEqualTo(BigInteger.ONE);
    }

    @Test
    public void testCompute_WhenNIsPositive_ThenReturnCorrectValue() {
        // Arrange
        int n = 5;

        // Act
        BigInteger result = FibonacciLoop.compute(n);

        // Assert
        assertThat(result).isEqualTo(new BigInteger("5"));
    }

    @Test
    public void testCompute_WhenNIsLarge_ThenReturnCorrectValue() {
        // Arrange
        int n = 50;

        // Act
        BigInteger result = FibonacciLoop.compute(n);

        // Assert
        assertThat(result).isEqualTo(new BigInteger("12586269025"));
    }
}