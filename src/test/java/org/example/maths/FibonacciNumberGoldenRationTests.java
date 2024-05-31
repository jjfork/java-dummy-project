package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class FibonacciNumberGoldenRationTests {

    @Test
    public void testComputeWithNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> FibonacciNumberGoldenRation.compute(-1));
    }

    @Test
    public void testComputeWithTooBigInput() {
        assertThrows(IllegalArgumentException.class, () -> FibonacciNumberGoldenRation.compute(71));
    }

    @Test
    public void testComputeWithZeroInput() {
        assertThat(FibonacciNumberGoldenRation.compute(0)).isEqualTo(0);
    }

    @Test
    public void testComputeWithOneInput() {
        assertThat(FibonacciNumberGoldenRation.compute(1)).isEqualTo(1);
    }

    @Test
    public void testComputeWithValidInput() {
        assertThat(FibonacciNumberGoldenRation.compute(10)).isEqualTo(55);
    }
}
