package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class HexToOctTests {

    @Test
    public void testHex2decimal() {
        // Arrange
        String hexValue = "1A";
        
        // Act
        int result = HexToOct.hex2decimal(hexValue);
        
        // Assert
        assertEquals(26, result);
    }

    @Test
    public void testDecimal2octal() {
        // Arrange
        int decimalValue = 26;
        
        // Act
        int result = HexToOct.decimal2octal(decimalValue);
        
        // Assert
        assertEquals(32, result);
    }
}