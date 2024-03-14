package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FibonacciNumberCheckTests {

    @Test
    public void testIsPerfectSquare() {
        // Arrange
        long number = 16;

        // Act
        boolean result = FibonacciNumberCheck.isPerfectSquare(number);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testIsFibonacciNumber() {
        // Arrange
        long number = 5;

        // Act
        boolean result = FibonacciNumberCheck.isFibonacciNumber(number);

        // Assert
        assertThat(result).isTrue();
    }
}