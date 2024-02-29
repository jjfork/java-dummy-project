package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FindMinRecursionTests {

    @Test
    public void testMinWithArray() {
        int[] array = {3, 6, 2, 8, 1, 5};
        int expectedMin = 1;
        int actualMin = FindMinRecursion.min(array);
        assertThat(actualMin).isEqualTo(expectedMin);
    }

    @Test
    public void testMinWithEmptyArray() {
        int[] array = {};
        try {
            FindMinRecursion.min(array);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("array must be non-empty.");
        }
    }

    @Test
    public void testMinWithSingleElementArray() {
        int[] array = {5};
        int expectedMin = 5;
        int actualMin = FindMinRecursion.min(array);
        assertThat(actualMin).isEqualTo(expectedMin);
    }

    @Test
    public void testMinWithLargeArray() {
        int[] array = {9, 4, 7, 2, 6, 1, 8, 3, 5};
        int expectedMin = 1;
        int actualMin = FindMinRecursion.min(array);
        assertThat(actualMin).isEqualTo(expectedMin);
    }
}