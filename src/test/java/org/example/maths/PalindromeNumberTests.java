package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PalindromeNumberTests {

    @Test
    public void testIsPalindrome_whenNumberIsPalindrome_thenReturnTrue() {
        // Arrange
        int number = 12321;

        // Act
        boolean result = PalindromeNumber.isPalindrome(number);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testIsPalindrome_whenNumberIsNotPalindrome_thenReturnFalse() {
        // Arrange
        int number = 12345;

        // Act
        boolean result = PalindromeNumber.isPalindrome(number);

        // Assert
        assertThat(result).isFalse();
    }

    @Test
    public void testIsPalindrome_whenNumberIsNegative_thenThrowIllegalArgumentException() {
        // Arrange
        int number = -123;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> {
            PalindromeNumber.isPalindrome(number);
        });
    }
}