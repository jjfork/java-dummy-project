package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OctalToHexadecimalTests {

    @Test
    public void testOctToDec() {
        // Given
        String octalNumber = "17";
        
        // When
        int result = OctalToHexadecimal.octToDec(octalNumber);
        
        // Then
        assertEquals(15, result);
    }

    @Test
    public void testDecimalToHex() {
        // Given
        int decimalNumber = 15;
        
        // When
        String result = OctalToHexadecimal.decimalToHex(decimalNumber);
        
        // Then
        assertEquals("F", result);
    }
}