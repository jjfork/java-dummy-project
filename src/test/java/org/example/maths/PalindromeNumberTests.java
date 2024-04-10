package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PalindromeNumberTests {

    @Test
    public void testIsPalindrome_whenNumberIsPalindrome_thenReturnTrue() {
        int number = 12321;
        boolean result = PalindromeNumber.isPalindrome(number);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsPalindrome_whenNumberIsNotPalindrome_thenReturnFalse() {
        int number = 12345;
        boolean result = PalindromeNumber.isPalindrome(number);
        assertThat(result).isFalse();
    }

    @Test
    public void testIsPalindrome_whenNumberIsNegative_thenThrowIllegalArgumentException() {
        int number = -123;
        assertThatThrownBy(() -> PalindromeNumber.isPalindrome(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Input parameter must not be negative!");
    }
}