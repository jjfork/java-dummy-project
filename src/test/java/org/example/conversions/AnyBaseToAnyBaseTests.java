package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AnyBaseToAnyBaseTests {

    @Test
    public void testValidForBase_ValidNumber_ReturnsTrue() {
        // Arrange
        String n = "123";
        int base = 4;

        // Act
        boolean result = AnyBaseToAnyBase.validForBase(n, base);

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void testValidForBase_InvalidNumber_ReturnsFalse() {
        // Arrange
        String n = "12A";
        int base = 2;

        // Act
        boolean result = AnyBaseToAnyBase.validForBase(n, base);

        // Assert
        assertEquals(false, result);
    }

    @Test
    public void testBase2Base_ConvertsNumberCorrectly() {
        // Arrange
        String n = "1010";
        int b1 = 2;
        int b2 = 10;

        // Act
        String result = AnyBaseToAnyBase.base2base(n, b1, b2);

        // Assert
        assertEquals("10", result);
    }
}