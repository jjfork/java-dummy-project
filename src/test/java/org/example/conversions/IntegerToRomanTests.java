package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class IntegerToRomanTests {

    @Test
    public void testIntegerToRoman() {
        // Given
        int input = 3549;
        String expected = "MMMDXLIX";

        // When
        String result = IntegerToRoman.integerToRoman(input);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIntegerToRomanWithZero() {
        // Given
        int input = 0;
        String expected = "";

        // When
        String result = IntegerToRoman.integerToRoman(input);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIntegerToRomanWithNegativeNumber() {
        // Given
        int input = -123;
        String expected = "";

        // When
        String result = IntegerToRoman.integerToRoman(input);

        // Then
        assertThat(result).isEqualTo(expected);
    }
}