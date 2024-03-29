package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AnyBaseToAnyBaseTests {

    @Test
    public void testValidForBase_ValidNumber_ReturnsTrue() {
        // Arrange
        String number = "123";
        int base = 4;

        // Act
        boolean result = AnyBaseToAnyBase.validForBase(number, base);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testValidForBase_InvalidNumber_ReturnsFalse() {
        // Arrange
        String number = "12A";
        int base = 2;

        // Act
        boolean result = AnyBaseToAnyBase.validForBase(number, base);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testBase2Base_ConvertsNumberFromBase2ToBase10() {
        // Arrange
        String number = "1010";
        int base1 = 2;
        int base2 = 10;

        // Act
        String result = AnyBaseToAnyBase.base2base(number, base1, base2);

        // Assert
        assertEquals("10", result);
    }

    @Test
    public void testBase2Base_ConvertsNumberFromBase10ToBase16() {
        // Arrange
        String number = "255";
        int base1 = 10;
        int base2 = 16;

        // Act
        String result = AnyBaseToAnyBase.base2base(number, base1, base2);

        // Assert
        assertEquals("FF", result);
    }
}