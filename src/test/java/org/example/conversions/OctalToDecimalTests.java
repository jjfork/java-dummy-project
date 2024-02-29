package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OctalToDecimalTests {

    @InjectMocks
    private OctalToDecimal octalToDecimal;

    @Test
    public void testConvertOctalToDecimal_validInput() {
        // Arrange
        String inputOctal = "10";
        
        // Act
        int result = octalToDecimal.convertOctalToDecimal(inputOctal);
        
        // Assert
        assertThat(result).isEqualTo(8);
    }

    @Test
    public void testConvertOctalToDecimal_invalidInput() {
        // Arrange
        String inputOctal = "8";
        
        // Act
        int result = octalToDecimal.convertOctalToDecimal(inputOctal);
        
        // Assert
        assertThat(result).isEqualTo(-1);
    }
}