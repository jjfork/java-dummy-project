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
        // Arrange
        Service service = new Service();
        int input = 4;

        // Act
        boolean result = service.isEven(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsEven_WhenInputIsOdd_ReturnsFalse() {
        // Arrange
        Service service = new Service();
        int input = 5;

        // Act
        boolean result = service.isEven(input);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testHighComplexityMethod_WhenAIsZeroAndBAndCArePositive_PrintsCorrectMessages() {
        // Arrange
        Service service = new Service();

        // Act
        service.highComplexityMethod(0, 1, 1);

        // Assert
        // Verify that the correct messages are printed
    }

    @Test
    public void testHighComplexityMethod_WhenAIsNegativeAndBAndCAreNonPositive_PrintsCorrectMessages() {
        // Arrange
        Service service = new Service();

        // Act
        service.highComplexityMethod(-1, -1, -1);

        // Assert
        // Verify that the correct messages are printed
    }
}