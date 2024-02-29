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
    public void testValOfChar() {
        // Arrange
        char input = 'A';
        
        // Act
        int result = AnyBaseToDecimal.valOfChar(input);
        
        // Assert
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void testValOfCharWithDigit() {
        // Arrange
        char input = '5';
        
        // Act
        int result = AnyBaseToDecimal.valOfChar(input);
        
        // Assert
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testValOfCharWithInvalidCharacter() {
        // Arrange
        char input = '!';
        
        // Act & Assert
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
            AnyBaseToDecimal.valOfChar(input);
        });
        assertThat(exception.getMessage()).isEqualTo("invalid character :!");
    }
}