package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import java.math.BigInteger;

@ExtendWith(MockitoExtension.class)
public class FibonacciLoopTests {

    @Test
    public void testCompute_WhenNIs0_ThenReturn0() {
        // Arrange
        int n = 0;

        // Act
        BigInteger result = FibonacciLoop.compute(n);

        // Assert
        assertThat(result).isEqualTo(BigInteger.valueOf(0));
    }

    @Test
    public void testCompute_WhenNIs1_ThenReturn1() {
        // Arrange
        int n = 1;

        // Act
        BigInteger result = FibonacciLoop.compute(n);

        // Assert
        assertThat(result).isEqualTo(BigInteger.valueOf(1));
    }

    @Test
    public void testCompute_WhenNIs5_ThenReturn5() {
        // Arrange
        int n = 5;

        // Act
        BigInteger result = FibonacciLoop.compute(n);

        // Assert
        assertThat(result).isEqualTo(BigInteger.valueOf(5));
    }

    @Test
    public void testCompute_WhenNIs10_ThenReturn55() {
        // Arrange
        int n = 10;

        // Act
        BigInteger result = FibonacciLoop.compute(n);

        // Assert
        assertThat(result).isEqualTo(BigInteger.valueOf(55));
    }
}