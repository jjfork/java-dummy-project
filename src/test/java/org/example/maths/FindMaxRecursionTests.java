package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FindMaxRecursionTests {

    @Test
    public void testMaxWithEmptyArray() {
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> FindMaxRecursion.max(array));
    }

    @Test
    public void testMaxWithSingleElementArray() {
        int[] array = {5};
        assertThat(FindMaxRecursion.max(array)).isEqualTo(5);
    }

    @Test
    public void testMaxWithMultipleElementsArray() {
        int[] array = {3, 7, 2, 9, 1, 5};
        assertThat(FindMaxRecursion.max(array)).isEqualTo(9);
    }

    @Test
    public void testMaxWithNegativeNumbers() {
        int[] array = {-3, -7, -2, -9, -1, -5};
        assertThat(FindMaxRecursion.max(array)).isEqualTo(-1);
    }
}