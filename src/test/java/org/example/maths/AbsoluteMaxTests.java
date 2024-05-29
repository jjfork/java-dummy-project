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
public class AbsoluteMaxTests {

    @Test
    public void testGetMaxValue_withPositiveNumbers() {
        int result = AbsoluteMax.getMaxValue(1, 2, 3, 4, 5);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testGetMaxValue_withNegativeNumbers() {
        int result = AbsoluteMax.getMaxValue(-1, -2, -3, -4, -5);
        assertThat(result).isEqualTo(-5);
    }

    @Test
    public void testGetMaxValue_withMixedNumbers() {
        int result = AbsoluteMax.getMaxValue(-1, 2, -3, 4, -5);
        assertThat(result).isEqualTo(-5);
    }

    @Test
    public void testGetMaxValue_withSingleNumber() {
        int result = AbsoluteMax.getMaxValue(10);
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void testGetMaxValue_withZero() {
        int result = AbsoluteMax.getMaxValue(0);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testGetMaxValue_withNullArray() {
        try {
            AbsoluteMax.getMaxValue(null);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Numbers array cannot be empty or null");
        }
    }

    @Test
    public void testGetMaxValue_withEmptyArray() {
        try {
            AbsoluteMax.getMaxValue();
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Numbers array cannot be empty or null");
        }
    }
}
