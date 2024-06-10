package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GCDTests {

    @Test
    public void testGcd_TwoNumbers() {
        int result = GCD.gcd(12, 18);
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void testGcd_ArrayOfNumbers() {
        int[] numbers = {24, 36, 48};
        int result = GCD.gcd(numbers);
        assertThat(result).isEqualTo(12);
    }

    @Test
    public void testGcd_ZeroInput() {
        int result = GCD.gcd(0, 5);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testGcd_NegativeInput() {
        assertThrows(ArithmeticException.class, () -> {
            GCD.gcd(-10, 20);
        });
    }

}