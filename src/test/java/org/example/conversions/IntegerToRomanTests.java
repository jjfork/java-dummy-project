package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class IntegerToRomanTests {

    @Test
    public void testIntegerToRoman_WhenInputIs3_ThenReturnIII() {
        // Arrange
        int input = 3;

        // Act
        String result = IntegerToRoman.integerToRoman(input);

        // Assert
        assertThat(result).isEqualTo("III");
    }

    @Test
    public void testIntegerToRoman_WhenInputIs9_ThenReturnIX() {
        // Arrange
        int input = 9;

        // Act
        String result = IntegerToRoman.integerToRoman(input);

        // Assert
        assertThat(result).isEqualTo("IX");
    }

    @Test
    public void testIntegerToRoman_WhenInputIs58_ThenReturnLVIII() {
        // Arrange
        int input = 58;

        // Act
        String result = IntegerToRoman.integerToRoman(input);

        // Assert
        assertThat(result).isEqualTo("LVIII");
    }

    @Test
    public void testIntegerToRoman_WhenInputIs1994_ThenReturnMCMXCIV() {
        // Arrange
        int input = 1994;

        // Act
        String result = IntegerToRoman.integerToRoman(input);

        // Assert
        assertThat(result).isEqualTo("MCMXCIV");
    }
}