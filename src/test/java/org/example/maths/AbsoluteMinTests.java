package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class AbsoluteMinTests {

    @Test
    public void testGetMinValue_withPositiveNumbers() {
        int result = AbsoluteMin.getMinValue(3, 5, 1, 9);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testGetMinValue_withNegativeNumbers() {
        int result = AbsoluteMin.getMinValue(-3, -5, -1, -9);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void testGetMinValue_withMixedNumbers() {
        int result = AbsoluteMin.getMinValue(-3, 5, -1, 9);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void testGetMinValue_withSingleNumber() {
        int result = AbsoluteMin.getMinValue(8);
        assertThat(result).isEqualTo(8);
    }

    @Test
    public void testGetMinValue_withZero() {
        int result = AbsoluteMin.getMinValue(0, 5, 1, 9);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testGetMinValue_withEmptyArray_shouldThrowException() {
        assertThatThrownBy(() -> AbsoluteMin.getMinValue()).isInstanceOf(IllegalArgumentException.class).hasMessage("Numbers array cannot be empty");
    }
}