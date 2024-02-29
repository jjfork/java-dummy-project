package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FindMinTests {

    @Test
    public void testFindMin_withValidArray_returnsMinValue() {
        // Arrange
        int[] array = {3, 5, 1, 9, 2};
        
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
}