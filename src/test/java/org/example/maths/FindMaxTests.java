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
public class FindMaxTests {

    @Test
    public void testFindMax_withPositiveNumbers() {
        int[] array = {3, 7, 2, 9, 5};
        int result = FindMax.findMax(array);
        assertThat(result).isEqualTo(9);
    }

    @Test
    public void testFindMax_withNegativeNumbers() {
        int[] array = {-3, -7, -2, -9, -5};
        int result = FindMax.findMax(array);
        assertThat(result).isEqualTo(-2);
    }

    @Test
    public void testFindMax_withMixedNumbers() {
        int[] array = {-3, 7, -2, 9, -5};
        int result = FindMax.findMax(array);
        assertThat(result).isEqualTo(9);
    }

    @Test
    public void testFindMax_withSingleElementArray() {
        int[] array = {5};
        int result = FindMax.findMax(array);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testFindMax_withEmptyArray() {
        int[] array = {};
        try {
            FindMax.findMax(array);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Array must be non-empty.");
        }
    }
}
