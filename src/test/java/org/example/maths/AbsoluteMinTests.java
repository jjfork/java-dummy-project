package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class AbsoluteMinTests {

    @Test
    public void testGetMinValue_WithPositiveNumbers_ReturnsAbsoluteMin() {
        // Arrange
        int[] numbers = {3, 5, 1, 9, 2};
        
        // Act
        int result = AbsoluteMin.getMinValue(numbers);
        
        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testGetMinValue_WithNegativeNumbers_ReturnsAbsoluteMin() {
        // Arrange
        int[] numbers = {-3, -5, -1, -9, -2};
        
        // Act
        int result = AbsoluteMin.getMinValue(numbers);
        
        // Assert
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void testGetMinValue_WithMixedNumbers_ReturnsAbsoluteMin() {
        // Arrange
        int[] numbers = {-3, 5, -1, 9, -2};
        
        // Act
        int result = AbsoluteMin.getMinValue(numbers);
        
        // Assert
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void testGetMinValue_WithSingleNumber_ReturnsAbsoluteMin() {
        // Arrange
        int[] numbers = {8};
        
        // Act
        int result = AbsoluteMin.getMinValue(numbers);
        
        // Assert
        assertThat(result).isEqualTo(8);
    }

    @Test
    public void testGetMinValue_WithEmptyArray_ThrowsIllegalArgumentException() {
        // Arrange
        int[] numbers = {};
        
        // Act and Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            AbsoluteMin.getMinValue(numbers);
        });
        assertThat(exception.getMessage()).isEqualTo("Numbers array cannot be empty");
    }
}