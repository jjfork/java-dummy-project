package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class FindMinTests {

    @Test
    public void testFindMin_withValidArray_returnsMinValue() {
        // Arrange
        int[] array = {3, 7, 2, 8, 1};
        
        // Act
        int result = FindMin.findMin(array);
        
        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testFindMin_withEmptyArray_throwsIllegalArgumentException() {
        // Arrange
        int[] array = {};
        
        // Act and Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            FindMin.findMin(array);
        });
        assertThat(exception.getMessage()).isEqualTo("Array must be non-empty.");
    }

    @Test
    public void testFindMin_withSingleElementArray_returnsElementValue() {
        // Arrange
        int[] array = {5};
        
        // Act
        int result = FindMin.findMin(array);
        
        // Assert
        assertThat(result).isEqualTo(5);
    }
}