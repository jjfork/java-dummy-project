package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OctalToHexadecimalTests {

    @Test
    public void testOctToDec() {
        // Given
        String octalNumber = "123";
        
        // When
        int result = OctalToHexadecimal.octToDec(octalNumber);
        
        // Then
        assertEquals(83, result);
    }

    @Test
    public void testDecimalToHex() {
        // Given
        int decimalNumber = 123;
        
        // When
        String result = OctalToHexadecimal.decimalToHex(decimalNumber);
        
        // Then
        assertEquals("7B", result);
    }
}