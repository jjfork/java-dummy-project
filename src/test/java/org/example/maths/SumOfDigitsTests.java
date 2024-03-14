package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SumOfDigitsTests {

    @Test
    public void testSumOfDigits() {
        // Given
        int number = 12345;

        // When
        int result = SumOfDigits.sumOfDigits(number);

        // Then
        assertEquals(15, result);
    }

    @Test
    public void testSumOfDigitsRecursion() {
        // Given
        int number = 12345;

        // When
        int result = SumOfDigits.sumOfDigitsRecursion(number);

        // Then
        assertEquals(15, result);
    }

    @Test
    public void testSumOfDigitsFast() {
        // Given
        int number = 12345;

        // When
        int result = SumOfDigits.sumOfDigitsFast(number);

        // Then
        assertEquals(15, result);
    }
}