package org.example.conversions;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AnyBaseToDecimalTests {

    @Test
    public void testConvertToDecimal_validInput() {
        // Arrange
        String input = "1010";
        int radix = 2;
        int expected = 10;

        // Act
        int result = AnyBaseToDecimal.convertToDecimal(input, radix);

        // Assert
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testConvertToDecimal_invalidInput() {
        // Arrange
        String input = "12";
        int radix = 2;

        // Act and Assert
        assertThrows(NumberFormatException.class, () -> AnyBaseToDecimal.convertToDecimal(input, radix));
    }

    @Test
    public void testValOfChar_digit() {
        // Arrange
        char c = '5';
        int expected = 5;

        // Act
        int result = AnyBaseToDecimal.valOfChar(c);

        // Assert
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testValOfChar_upperCaseLetter() {
        // Arrange
        char c = 'A';
        int expected = 10;

        // Act
        int result = AnyBaseToDecimal.valOfChar(c);

        // Assert
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testValOfChar_invalidCharacter() {
        // Arrange
        char c = '$';

        // Act and Assert
        assertThrows(NumberFormatException.class, () -> AnyBaseToDecimal.valOfChar(c));
    }
}
