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
public class GCDRecursionTests {

    @Test
    public void testGcd_whenAAndBAreZero_thenReturnAbsoluteDifference() {
        int result = GCDRecursion.gcd(0, 0);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testGcd_whenAIsZero_thenReturnB() {
        int result = GCDRecursion.gcd(0, 5);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testGcd_whenBIsZero_thenReturnA() {
        int result = GCDRecursion.gcd(10, 0);
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void testGcd_whenAIsLessThanZero_thenThrowArithmeticException() {
        assertThatThrownBy(() -> GCDRecursion.gcd(-5, 10))
                .isInstanceOf(ArithmeticException.class);
    }

    @Test
    public void testGcd_whenBIsLessThanZero_thenThrowArithmeticException() {
        assertThatThrownBy(() -> GCDRecursion.gcd(15, -3))
                .isInstanceOf(ArithmeticException.class);
    }

    @Test
    public void testGcd_whenAAndBArePositiveIntegers_thenReturnGcd() {
        int result = GCDRecursion.gcd(24, 36);
        assertThat(result).isEqualTo(12);
    }

    @Test
    public void testGcd_whenAAndBAreCoPrime_thenReturn1() {
        int result = GCDRecursion.gcd(17, 31);
        assertThat(result).isEqualTo(1);
    }
}