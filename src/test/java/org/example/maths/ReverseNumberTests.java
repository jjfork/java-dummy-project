package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ReverseNumberTests {

    @Test
    public void testReverseNumber_whenNumberIsPositive_thenReversedNumber() {
        // Arrange
        int number = 12345;

        // Act
        int result = ReverseNumber.reverseNumber(number);

        // Assert
        assertEquals(54321, result);
    }

    @Test
    public void testReverseNumber_whenNumberIsZero_thenZero() {
        // Arrange
        int number = 0;

        // Act
        int result = ReverseNumber.reverseNumber(number);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void testReverseNumber_whenNumberIsNegative_thenThrowIllegalArgumentException() {
        // Arrange
        int number = -123;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> ReverseNumber.reverseNumber(number));
    }
}