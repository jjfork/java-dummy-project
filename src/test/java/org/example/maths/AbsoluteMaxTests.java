package org.example.maths;

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
    public void testGetMaxValue_withNullInput() {
        try {
            AbsoluteMax.getMaxValue(null);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Numbers array cannot be empty or null");
        }
    }

    @Test
    public void testGetMaxValue_withEmptyInput() {
        try {
            AbsoluteMax.getMaxValue();
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Numbers array cannot be empty or null");
        }
    }
}