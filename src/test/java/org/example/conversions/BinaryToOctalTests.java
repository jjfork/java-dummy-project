package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BinaryToOctalTests {

    @Test
    public void testConvertBinaryToOctal() {
        // Arrange
        int binary = 101010;
        
        // Act
        String result = BinaryToOctal.convertBinaryToOctal(binary);
        
        // Assert
        assertEquals("52", result);
    }
}