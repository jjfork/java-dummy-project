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
    public void testFindMin_withPositiveNumbers() {
        int[] array = {3, 5, 1, 9, 2};
        int result = FindMin.findMin(array);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testFindMin_withNegativeNumbers() {
        int[] array = {-3, -5, -1, -9, -2};
        int result = FindMin.findMin(array);
        assertThat(result).isEqualTo(-9);
    }

    @Test
    public void testFindMin_withMixedNumbers() {
        int[] array = {-3, 5, 0, -9, 2};
        int result = FindMin.findMin(array);
        assertThat(result).isEqualTo(-9);
    }

    @Test
    public void testFindMin_withSingleElementArray() {
        int[] array = {5};
        int result = FindMin.findMin(array);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testFindMin_withEmptyArray() {
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> FindMin.findMin(array));
    }
}