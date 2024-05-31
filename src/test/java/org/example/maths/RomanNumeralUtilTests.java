package org.example.maths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralUtilTests {

    @Test
    public void testGenerate_ValidNumber_ReturnsRomanNumeral() {
        // Given
        int number = 2021;
        
        // When
        String result = RomanNumeralUtil.generate(number);
        
        // Then
        assertEquals("MMXXI", result);
    }

    @Test
    public void testGenerate_MinValue_ReturnsRomanNumeral() {
        // Given
        int number = 1;
        
        // When
        String result = RomanNumeralUtil.generate(number);
        
        // Then
        assertEquals("I", result);
    }

    @Test
    public void testGenerate_MaxValue_ReturnsRomanNumeral() {
        // Given
        int number = 5999;
        
        // When
        String result = RomanNumeralUtil.generate(number);
        
        // Then
        assertEquals("MMMMMCMXCIX", result);
    }

    @Test
    public void testGenerate_InvalidNumber_ThrowsIllegalArgumentException() {
        // Given
        int number = 6000;
        
        // When & Then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> RomanNumeralUtil.generate(number));
        assertEquals("The number must be in the range [1, 5999]", exception.getMessage());
    }
}
