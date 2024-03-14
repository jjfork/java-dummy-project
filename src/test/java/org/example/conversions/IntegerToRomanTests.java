package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class IntegerToRomanTests {

    @Test
    public void integerToRoman_WhenInputIs1_ThenReturnI() {
        // Arrange
        int input = 1;

        // Act
        String result = IntegerToRoman.integerToRoman(input);

        // Assert
        assertThat(result).isEqualTo("I");
    }

    @Test
    public void integerToRoman_WhenInputIs3999_ThenReturnMMMCMXCIX() {
        // Arrange
        int input = 3999;

        // Act
        String result = IntegerToRoman.integerToRoman(input);

        // Assert
        assertThat(result).isEqualTo("MMMCMXCIX");
    }

    @Test
    public void integerToRoman_WhenInputIs0_ThenReturnEmptyString() {
        // Arrange
        int input = 0;

        // Act
        String result = IntegerToRoman.integerToRoman(input);

        // Assert
        assertThat(result).isEmpty();
    }
}