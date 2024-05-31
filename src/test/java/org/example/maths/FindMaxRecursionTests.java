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

@ExtendWith(MockitoExtension.class)
public class FindMaxRecursionTests {

    @Test
    public void testMaxWithEmptyArray() {
        int[] array = {};
        try {
            FindMaxRecursion.max(array);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Array must be non-empty.");
        }
    }

    @Test
    public void testMaxWithSingleElementArray() {
        int[] array = {5};
        int result = FindMaxRecursion.max(array);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testMaxWithMultipleElements() {
        int[] array = {3, 7, 2, 9, 1, 5};
        int result = FindMaxRecursion.max(array);
        assertThat(result).isEqualTo(9);
    }

    @Test
    public void testMaxWithAllNegativeElements() {
        int[] array = {-3, -7, -2, -9, -1, -5};
        int result = FindMaxRecursion.max(array);
        assertThat(result).isEqualTo(-1);
    }
}
