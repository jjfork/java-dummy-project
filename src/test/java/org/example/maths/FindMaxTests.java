package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FindMaxTests {

    @Test
    public void testFindMax_WhenArrayIsEmpty_ThenThrowIllegalArgumentException() {
        // Arrange
        int[] array = new int[0];

        // Act and Assert
        assertThatThrownBy(() -> FindMax.findMax(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Array must be non-empty.");
    }

    @Test
    public void testFindMax_WhenArrayHasMultipleElements_ThenReturnMaxValue() {
        // Arrange
        int[] array = {3, 7, 2, 9, 5};

        // Act
        int result = FindMax.findMax(array);

        // Assert
        assertThat(result).isEqualTo(9);
    }
}