package org.example.conversions;

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
public class IntegerToRomanTests {

    @Test
    public void testIntegerToRoman() {
        // Given
        int num = 3549;
        String expected = "MMMDXLIX";

        // When
        String result = IntegerToRoman.integerToRoman(num);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIntegerToRoman_ZeroInput() {
        // Given
        int num = 0;
        String expected = "";

        // When
        String result = IntegerToRoman.integerToRoman(num);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIntegerToRoman_NegativeInput() {
        // Given
        int num = -123;
        String expected = "";

        // When
        String result = IntegerToRoman.integerToRoman(num);

        // Then
        assertThat(result).isEqualTo(expected);
    }
}
