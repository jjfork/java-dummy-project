package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LongDivisionTests {

    @Test
    public void testDivide_PositiveNumbers_ReturnsCorrectResult() {
        // Arrange
        int dividend = 10;
        int divisor = 2;

        // Act
        int result = LongDivision.divide(dividend, divisor);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testDivide_NegativeDividend_ReturnsCorrectResult() {
        // Arrange
        int dividend = -10;
        int divisor = 2;

        // Act
        int result = LongDivision.divide(dividend, divisor);

        // Assert
        assertEquals(-5, result);
    }

    @Test
    public void testDivide_NegativeDivisor_ReturnsCorrectResult() {
        // Arrange
        int dividend = 10;
        int divisor = -2;

        // Act
        int result = LongDivision.divide(dividend, divisor);

        // Assert
        assertEquals(-5, result);
    }

    @Test
    public void testDivide_DividendZero_ReturnsZero() {
        // Arrange
        int dividend = 0;
        int divisor = 2;

        // Act
        int result = LongDivision.divide(dividend, divisor);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void testDivide_DivisorZero_ReturnsZero() {
        // Arrange
        int dividend = 10;
        int divisor = 0;

        // Act
        int result = LongDivision.divide(dividend, divisor);

        // Assert
        assertEquals(0, result);
    }
}