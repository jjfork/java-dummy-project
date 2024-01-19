package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

    @Test
    public void testIsEven_WhenInputIsEven_ReturnsTrue() {
        Service service = new Service();
        boolean result = service.isEven(4);
        assertTrue(result);
    }

    @Test
    public void testIsEven_WhenInputIsOdd_ReturnsFalse() {
        Service service = new Service();
        boolean result = service.isEven(5);
        assertFalse(result);
    }

    @Test
    public void testHighComplexityMethod_WhenAIsZeroBIsPositiveCIsPositive_PrintsCorrectMessage() {
        Service service = new Service();
        service.highComplexityMethod(0, 2, 3);
        // Add assertion for console output
    }

    @Test
    public void testHighComplexityMethod_WhenAIsNegativeBIsNonPositiveCIsNonPositive_PrintsCorrectMessage() {
        Service service = new Service();
        service.highComplexityMethod(-1, 0, -1);
        // Add assertion for console output
    }
}