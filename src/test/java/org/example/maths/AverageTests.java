package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AverageTests {

    @Test
    public void testAverageDouble() {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        double expected = 3.0;
        double result = Average.average(numbers);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testAverageDoubleEmptyArray() {
        double[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> Average.average(numbers));
    }

    @Test
    public void testAverageInt() {
        int[] numbers = {1, 2, 3, 4, 5};
        int expected = 3;
        int result = Average.average(numbers);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testAverageIntEmptyArray() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> Average.average(numbers));
    }
}
