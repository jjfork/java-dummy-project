package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class ParseIntegerTests {

    @Test
    public void testParseInt_PositiveNumber_ReturnsCorrectValue() {
        // Arrange
        String input = "123";

        // Act
        int result = ParseInteger.parseInt(input);

        // Assert
        assertThat(result).isEqualTo(123);
    }

    @Test
    public void testParseInt_NegativeNumber_ReturnsCorrectValue() {
        // Arrange
        String input = "-456";

        // Act
        int result = ParseInteger.parseInt(input);

        // Assert
        assertThat(result).isEqualTo(-456);
    }

    @Test
    public void testParseInt_InvalidInput_ThrowsNumberFormatException() {
        // Arrange
        String input = "12a";

        // Act and Assert
        assertThrows(NumberFormatException.class, () -> {
            ParseInteger.parseInt(input);
        });
    }

    @Test
    public void testParseInt_NullInput_ThrowsNumberFormatException() {
        // Arrange
        String input = null;

        // Act and Assert
        assertThrows(NumberFormatException.class, () -> {
            ParseInteger.parseInt(input);
        });
    }

    @Test
    public void testParseInt_EmptyInput_ThrowsNumberFormatException() {
        // Arrange
        String input = "";

        // Act and Assert
        assertThrows(NumberFormatException.class, () -> {
            ParseInteger.parseInt(input);
        });
    }
}