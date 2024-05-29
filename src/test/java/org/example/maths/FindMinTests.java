package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinTests {

    @Test
    public void testFindMin_withPositiveNumbers() {
        int[] array = {3, 5, 1, 7, 9};
        int result = FindMin.findMin(array);
        assertEquals(1, result);
    }

    @Test
    public void testFindMin_withNegativeNumbers() {
        int[] array = {-3, -5, -1, -7, -9};
        int result = FindMin.findMin(array);
        assertEquals(-9, result);
    }

    @Test
    public void testFindMin_withMixedNumbers() {
        int[] array = {3, -5, 1, -7, 9};
        int result = FindMin.findMin(array);
        assertEquals(-7, result);
    }

    @Test
    public void testFindMin_withSingleElementArray() {
        int[] array = {5};
        int result = FindMin.findMin(array);
        assertEquals(5, result);
    }

    @Test
    public void testFindMin_withEmptyArray() {
        int[] array = {};
        try {
            FindMin.findMin(array);
        } catch (IllegalArgumentException e) {
            assertEquals("Array must be non-empty.", e.getMessage());
        }
    }
}
