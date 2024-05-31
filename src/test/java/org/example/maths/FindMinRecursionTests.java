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
public class FindMinRecursionTests {

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
        int result = FindMinRecursion.min(array);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testMinWithMultipleElementArray() {
        int[] array = {10, 5, 8, 3, 12};
        int result = FindMinRecursion.min(array);
        assertThat(result).isEqualTo(3);
    }

}
