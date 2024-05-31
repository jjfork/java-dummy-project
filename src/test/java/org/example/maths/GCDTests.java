package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

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
    public void testGcd_TwoNegativeNumbers() {
        assertThatThrownBy(() -> GCD.gcd(-12, -18)).isInstanceOf(ArithmeticException.class);
    }

    @Test
    public void testGcd_ArrayOfNumbers() {
        int[] numbers = {24, 36, 48};
        int result = GCD.gcd(numbers);
        assertThat(result).isEqualTo(12);
    }

}