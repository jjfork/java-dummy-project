package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FindMaxRecursionTests {

    @Test
    public void max_WhenArrayIsEmpty_ThrowsIllegalArgumentException() {
        int[] array = {};
        assertThatThrownBy(() -> FindMaxRecursion.max(array))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Array must be non-empty.");
    }

    @Test
    public void max_WhenArrayHasSingleElement_ReturnsElement() {
        int[] array = {5};
        int result = FindMaxRecursion.max(array);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void max_WhenArrayHasMultipleElements_ReturnsMaxElement() {
        int[] array = {3, 7, 2, 9, 5};
        int result = FindMaxRecursion.max(array);
        assertThat(result).isEqualTo(9);
    }
}