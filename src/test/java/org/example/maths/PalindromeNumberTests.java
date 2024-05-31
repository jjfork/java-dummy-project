package org.example.maths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class PalindromeNumberTests {

    @Test
    public void testIsPalindromeWithPositiveNumber() {
        assertTrue(PalindromeNumber.isPalindrome(121));
    }

    @Test
    public void testIsPalindromeWithNegativeNumber() {
        assertThatThrownBy(() -> PalindromeNumber.isPalindrome(-121))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Input parameter must not be negative!");
    }

    @Test
    public void testIsPalindromeWithZero() {
        assertTrue(PalindromeNumber.isPalindrome(0));
    }

    @Test
    public void testIsPalindromeWithLargeNumber() {
        assertTrue(PalindromeNumber.isPalindrome(123454321));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeNumber() {
        assertFalse(PalindromeNumber.isPalindrome(12345));
    }
}