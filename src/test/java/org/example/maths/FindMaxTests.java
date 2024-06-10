package org.example.maths;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class FindMaxTests {

    @Test
    public void testFindMax_withValidInput() {
        int[] array = {1, 3, 5, 2, 4};
        int expectedMax = 5;

        int actualMax = FindMax.findMax(array);

        assertThat(actualMax).isEqualTo(expectedMax);
    }

    @Test
    public void testFindMax_withEmptyArray() {
        int[] array = {};
        
        assertThatThrownBy(() -> FindMax.findMax(array))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Array must be non-empty.");
    }

    @Test
    public void testFindMax_withNegativeNumbers() {
        int[] array = {-1, -3, -5, -2, -4};
        int expectedMax = -1;

        int actualMax = FindMax.findMax(array);

        assertThat(actualMax).isEqualTo(expectedMax);
    }

    @Test
    public void testFindMax_withDuplicateMaxValue() {
        int[] array = {1, 3, 5, 5, 4};
        int expectedMax = 5;

        int actualMax = FindMax.findMax(array);

        assertThat(actualMax).isEqualTo(expectedMax);
    }
}