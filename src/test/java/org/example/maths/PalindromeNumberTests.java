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
    public void testIsPalindrome_WhenNumberIsPalindrome_ThenReturnTrue() {
        int number = 12321;
        boolean result = PalindromeNumber.isPalindrome(number);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsPalindrome_WhenNumberIsNotPalindrome_ThenReturnFalse() {
        int number = 12345;
        boolean result = PalindromeNumber.isPalindrome(number);
        assertThat(result).isFalse();
    }

    @Test
    public void testIsPalindrome_WhenNumberIsNegative_ThenThrowIllegalArgumentException() {
        int number = -123;
        assertThrows(IllegalArgumentException.class, () -> PalindromeNumber.isPalindrome(number));
    }
}