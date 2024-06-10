package org.example.maths;

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
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
    public void testGetMaxValue_withNullArray() {
        assertThatThrownBy(() -> AbsoluteMax.getMaxValue(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Numbers array cannot be empty or null");
    }

    @Test
    public void testGetMaxValue_withEmptyArray() {
        assertThatThrownBy(() -> AbsoluteMax.getMaxValue())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Numbers array cannot be empty or null");
    }
}
