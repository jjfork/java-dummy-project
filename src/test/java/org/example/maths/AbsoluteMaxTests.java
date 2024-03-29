package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class AbsoluteMaxTests {

    @Test
    public void testGetMaxValue_WithPositiveNumbers() {
        int[] numbers = {3, 5, 2, 8, 6};
        int result = AbsoluteMax.getMaxValue(numbers);
        assertThat(result).isEqualTo(8);
    }

    @Test
    public void testGetMaxValue_WithNegativeNumbers() {
        int[] numbers = {-3, -5, -2, -8, -6};
        int result = AbsoluteMax.getMaxValue(numbers);
        assertThat(result).isEqualTo(-8);
    }

    @Test
    public void testGetMaxValue_WithMixedNumbers() {
        int[] numbers = {-3, 5, -2, 8, -6};
        int result = AbsoluteMax.getMaxValue(numbers);
        assertThat(result).isEqualTo(8);
    }

    @Test
    public void testGetMaxValue_WithSingleNumber() {
        int[] numbers = {5};
        int result = AbsoluteMax.getMaxValue(numbers);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testGetMaxValue_WithNullInput() {
        int[] numbers = null;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            AbsoluteMax.getMaxValue(numbers);
        });
        assertThat(exception.getMessage()).isEqualTo("Numbers array cannot be empty or null");
    }
}