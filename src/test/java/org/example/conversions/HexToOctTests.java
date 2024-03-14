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
        // Given
        String hexValue = "1A";
        
        // When
        int decimalValue = HexToOct.hex2decimal(hexValue);
        
        // Then
        assertEquals(26, decimalValue);
    }

    @Test
    public void testDecimal2octal() {
        // Given
        int decimalValue = 26;
        
        // When
        int octalValue = HexToOct.decimal2octal(decimalValue);
        
        // Then
        assertEquals(32, octalValue);
    }
}