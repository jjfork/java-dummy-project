package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class AnyBaseToDecimalTests {

    @Test
    public void testConvertToDecimal() {
        // Arrange
        String input = "1010";
        int radix = 2;

        // Act
        int result = AnyBaseToDecimal.convertToDecimal(input, radix);

        // Assert
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void testConvertToDecimalWithInvalidInput() {
        // Arrange
        String input = "12A";
        int radix = 10;

        // Act and Assert
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
            AnyBaseToDecimal.convertToDecimal(input, radix);
        });

        assertThat(exception.getMessage()).isEqualTo("For input string 12A");
    }

    @Test
    public void testValOfCharWithDigit() {
        // Arrange
        char c = '5';

        // Act
        int result = AnyBaseToDecimal.valOfChar(c);

        // Assert
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testValOfCharWithUpperCaseLetter() {
        // Arrange
        char c = 'C';

        // Act
        int result = AnyBaseToDecimal.valOfChar(c);

        // Assert
        assertThat(result).isEqualTo(12);
    }

    @Test
    public void testValOfCharWithInvalidCharacter() {
        // Arrange
        char c = 'x';

        // Act and Assert
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
            AnyBaseToDecimal.valOfChar(c);
        });

        assertThat(exception.getMessage()).isEqualTo("invalid character :x");
    }
}