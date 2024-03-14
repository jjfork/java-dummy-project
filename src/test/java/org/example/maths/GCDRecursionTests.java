package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GCDRecursionTests {

    @Test
    public void testGcd_whenAAndBAreZero_thenReturnAbsoluteDifference() {
        // Arrange
        int a = 0;
        int b = 0;

        // Act
        int result = GCDRecursion.gcd(a, b);

        // Assert
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testGcd_whenAIsZero_thenReturnBAbsolute() {
        // Arrange
        int a = 0;
        int b = 5;

        // Act
        int result = GCDRecursion.gcd(a, b);

        // Assert
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testGcd_whenBIsZero_thenReturnAAbsolute() {
        // Arrange
        int a = 10;
        int b = 0;

        // Act
        int result = GCDRecursion.gcd(a, b);

        // Assert
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void testGcd_whenAAndBArePositive_thenReturnGCD() {
        // Arrange
        int a = 15;
        int b = 25;

        // Act
        int result = GCDRecursion.gcd(a, b);

        // Assert
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testGcd_whenAAndBAreNegative_thenThrowArithmeticException() {
        // Arrange
        int a = -15;
        int b = -25;

        // Act & Assert
        assertThatThrownBy(() -> GCDRecursion.gcd(a, b))
                .isInstanceOf(ArithmeticException.class);
    }
}