package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PalindromeNumberTests {

    @Test
    public void testIsPalindromeWithPositiveNumber() {
        int number = 121;
        boolean result = PalindromeNumber.isPalindrome(number);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsPalindromeWithNegativeNumber() {
        int number = -121;
        assertThrows(IllegalArgumentException.class, () -> PalindromeNumber.isPalindrome(number));
    }

    @Test
    public void testIsPalindromeWithZero() {
        int number = 0;
        boolean result = PalindromeNumber.isPalindrome(number);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsPalindromeWithNonPalindromeNumber() {
        int number = 123;
        boolean result = PalindromeNumber.isPalindrome(number);
        assertThat(result).isFalse();
    }
}