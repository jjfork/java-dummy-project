package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class HarshadNumberTests {

    @Test
    public void testIsHarshad_withLong_ValidInput_ReturnsTrue() {
        // Arrange
        long input = 18;

        // Act
        boolean result = HarshadNumber.isHarshad(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsHarshad_withLong_InvalidInput_ReturnsFalse() {
        // Arrange
        long input = -18;

        // Act
        boolean result = HarshadNumber.isHarshad(input);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testIsHarshad_withString_ValidInput_ReturnsTrue() {
        // Arrange
        String input = "18";

        // Act
        boolean result = HarshadNumber.isHarshad(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsHarshad_withString_InvalidInput_ReturnsFalse() {
        // Arrange
        String input = "-18";

        // Act
        boolean result = HarshadNumber.isHarshad(input);

        // Assert
        assertFalse(result);
    }
}