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
        String expectedOctal = "52";

        // Act
        String actualOctal = BinaryToOctal.convertBinaryToOctal(binary);

        // Assert
        assertEquals(expectedOctal, actualOctal);
    }
}