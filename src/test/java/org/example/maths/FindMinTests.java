package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FindMinTests {

    @Test
    public void testFindMin_withValidArray_returnsMinValue() {
        int[] array = {3, 5, 1, 7, 9};
        int min = FindMin.findMin(array);
        assertThat(min).isEqualTo(1);
    }

    @Test
    public void testFindMin_withEmptyArray_throwsIllegalArgumentException() {
        int[] array = {};
        try {
            FindMin.findMin(array);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Array must be non-empty.");
        }
    }

    @Test
    public void testFindMin_withSingleElementArray_returnsElementValue() {
        int[] array = {8};
        int min = FindMin.findMin(array);
        assertThat(min).isEqualTo(8);
    }

    @Test
    public void testFindMin_withAllNegativeValues_returnsMinNegativeValue() {
        int[] array = {-3, -5, -1, -7, -9};
        int min = FindMin.findMin(array);
        assertThat(min).isEqualTo(-9);
    }
}
