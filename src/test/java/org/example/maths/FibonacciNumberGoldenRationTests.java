package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciNumberGoldenRationTests {

    @Test
    public void testCompute_WhenInputIsZero_ThenReturnZero() {
        assertEquals(0, FibonacciNumberGoldenRation.compute(0));
    }

    @Test
    public void testCompute_WhenInputIsOne_ThenReturnOne() {
        assertEquals(1, FibonacciNumberGoldenRation.compute(1));
    }

    @Test
    public void testCompute_WhenInputIsPositive_ThenReturnCorrectResult() {
        assertEquals(1, FibonacciNumberGoldenRation.compute(2));
        assertEquals(2, FibonacciNumberGoldenRation.compute(3));
        assertEquals(3, FibonacciNumberGoldenRation.compute(4));
        assertEquals(5, FibonacciNumberGoldenRation.compute(5));
        assertEquals(8, FibonacciNumberGoldenRation.compute(6));
        // Add more test cases as needed
    }

    @Test
    public void testCompute_WhenInputIsTooBig_ThenThrowIllegalArgumentException() {
        try {
            FibonacciNumberGoldenRation.compute(71);
        } catch (IllegalArgumentException e) {
            assertEquals("Input 'n' is too big to give accurate result.", e.getMessage());
        }
    }

    @Test
    public void testCompute_WhenInputIsNegative_ThenThrowIllegalArgumentException() {
        try {
            FibonacciNumberGoldenRation.compute(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("Input 'n' must be a non-negative integer.", e.getMessage());
        }
    }
}
