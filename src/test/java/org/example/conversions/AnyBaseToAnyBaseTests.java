package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class AnyBaseToAnyBaseTests {

    @Test
    public void testValidForBase() {
        // Arrange
        String n = "10";
        int base = 2;

        // Act
        boolean result = AnyBaseToAnyBase.validForBase(n, base);

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void testBase2Base() {
        // Arrange
        String n = "10";
        int b1 = 2;
        int b2 = 10;

        // Act
        String result = AnyBaseToAnyBase.base2base(n, b1, b2);

        // Assert
        assertEquals("2", result);
    }
}