package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralUtilTests {

    @Test
    public void testGenerate_ValidNumber_ReturnsRomanNumeral() {
        int number = 2021;
        String result = RomanNumeralUtil.generate(number);
        assertEquals("MMXXI", result);
    }

    @Test
    public void testGenerate_MinValue_ReturnsRomanNumeral() {
        int number = 1;
        String result = RomanNumeralUtil.generate(number);
        assertEquals("I", result);
    }

    @Test
    public void testGenerate_MaxValue_ReturnsRomanNumeral() {
        int number = 5999;
        String result = RomanNumeralUtil.generate(number);
        assertEquals("MMMMMCMXCIX", result);
    }

    @Test
    public void testGenerate_InvalidNumber_ThrowsIllegalArgumentException() {
        int number = 6000;
        assertThatThrownBy(() -> RomanNumeralUtil.generate(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The number must be in the range [1, 5999]");
    }
}