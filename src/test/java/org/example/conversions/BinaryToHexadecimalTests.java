package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BinaryToHexadecimalTests {

    @Test
    void testBinToHex() {
        // Arrange
        int binary = 1010;
        
        // Act
        String result = BinaryToHexadecimal.binToHex(binary);
        
        // Assert
        assertEquals("A", result);
    }
}