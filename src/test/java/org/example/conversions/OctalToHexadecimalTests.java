package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class OctalToHexadecimalTests {

    @Test
    public void testOctToDec() {
        // Given
        String octalNumber = "123";
        
        // When
        int decimalNumber = OctalToHexadecimal.octToDec(octalNumber);
        
        // Then
        assertEquals(83, decimalNumber);
    }

    @Test
    public void testDecimalToHex() {
        // Given
        int decimalNumber = 83;
        
        // When
        String hexadecimalNumber = OctalToHexadecimal.decimalToHex(decimalNumber);
        
        // Then
        assertEquals("53", hexadecimalNumber);
    }
}