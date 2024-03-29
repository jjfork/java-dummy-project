package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AverageTests {

    @Test
    public void testAverage_doubleArray_validInput() {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        double result = Average.average(numbers);
        assertThat(result).isEqualTo(3.0);
    }

    @Test
    public void testAverage_doubleArray_emptyInput() {
        double[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> Average.average(numbers));
    }

    @Test
    public void testAverage_intArray_validInput() {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = Average.average(numbers);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void testAverage_intArray_emptyInput() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> Average.average(numbers));
    }
}