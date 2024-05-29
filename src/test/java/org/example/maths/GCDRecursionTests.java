package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GCDRecursionTests {

    @Test
    public void testGcdWithPositiveNumbers() {
        int result = GCDRecursion.gcd(12, 18);
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void testGcdWithZero() {
        int result = GCDRecursion.gcd(0, 5);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testGcdWithNegativeNumber() {
        assertThatThrownBy(() -> GCDRecursion.gcd(-10, 20))
                .isInstanceOf(ArithmeticException.class);
    }

    @Test
    public void testGcdWithSameNumbers() {
        int result = GCDRecursion.gcd(15, 15);
        assertThat(result).isEqualTo(15);
    }

    @Test
    public void testGcdWithLargeNumbers() {
        int result = GCDRecursion.gcd(1071, 462);
        assertThat(result).isEqualTo(21);
    }
}
