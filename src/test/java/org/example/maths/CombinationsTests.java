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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CombinationsTests {

    @Test
    public void testFactorial() {
        assertThat(Combinations.factorial(0)).isEqualTo(1);
        assertThat(Combinations.factorial(1)).isEqualTo(1);
        assertThat(Combinations.factorial(5)).isEqualTo(120);
        assertThat(Combinations.factorial(10)).isEqualTo(3628800);
    }

    @Test
    public void testCombinations() {
        assertThat(Combinations.combinations(5, 2)).isEqualTo(10);
        assertThat(Combinations.combinations(10, 3)).isEqualTo(120);
        assertThat(Combinations.combinations(6, 4)).isEqualTo(15);
    }

    @Test
    public void testCombinationsOptimized() {
        assertThat(Combinations.combinationsOptimized(5, 2)).isEqualTo(10);
        assertThat(Combinations.combinationsOptimized(10, 3)).isEqualTo(120);
        assertThat(Combinations.combinationsOptimized(6, 4)).isEqualTo(15);
    }

    @Test
    public void testFactorialNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Combinations.factorial(-1));
    }

    @Test
    public void testCombinationsNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> Combinations.combinations(-5, 2));
        assertThrows(IllegalArgumentException.class, () -> Combinations.combinations(5, -2));
    }

    @Test
    public void testCombinationsOptimizedNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> Combinations.combinationsOptimized(-5, 2));
        assertThrows(IllegalArgumentException.class, () -> Combinations.combinationsOptimized(5, -2));
    }

    @Test
    public void testCombinationsOptimizedNLessThanK() {
        assertThrows(IllegalArgumentException.class, () -> Combinations.combinationsOptimized(2, 5));
    }
}
