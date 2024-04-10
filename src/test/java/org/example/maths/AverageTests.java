package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class AverageTests {

    @Test
    public void testAverage_doubleArray() {
        double[] numbers = {1.0, 2.0, 3.0};
        double result = Average.average(numbers);
        assertThat(result).isEqualTo(2.0);
    }

    @Test
    public void testAverage_intArray() {
        int[] numbers = {1, 2, 3};
        int result = Average.average(numbers);
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void testAverage_doubleArray_emptyArray() {
        double[] numbers = {};
        assertThatThrownBy(() -> Average.average(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Numbers array cannot be empty or null");
    }

    @Test
    public void testAverage_intArray_emptyArray() {
        int[] numbers = {};
        assertThatThrownBy(() -> Average.average(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Numbers array cannot be empty or null");
    }

    @Test
    public void testAverage_doubleArray_nullArray() {
        double[] numbers = null;
        assertThatThrownBy(() -> Average.average(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Numbers array cannot be empty or null");
    }

    @Test
    public void testAverage_intArray_nullArray() {
        int[] numbers = null;
        assertThatThrownBy(() -> Average.average(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Numbers array cannot be empty or null");
    }
}