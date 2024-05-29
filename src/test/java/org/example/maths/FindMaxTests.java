package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FindMaxTests {

    @Test
    public void testFindMax_withValidArray_returnsMaxValue() {
        int[] array = {1, 5, 3, 9, 2};
        int result = FindMax.findMax(array);
        assertThat(result).isEqualTo(9);
    }

    @Test
    public void testFindMax_withEmptyArray_throwsIllegalArgumentException() {
        int[] array = {};
        try {
            FindMax.findMax(array);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Array must be non-empty.");
        }
    }

    @Test
    public void testFindMax_withSingleElementArray_returnsElementValue() {
        int[] array = {7};
        int result = FindMax.findMax(array);
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void testFindMax_withNegativeValues_returnsMaxNegativeValue() {
        int[] array = {-5, -2, -8, -3};
        int result = FindMax.findMax(array);
        assertThat(result).isEqualTo(-2);
    }
}
