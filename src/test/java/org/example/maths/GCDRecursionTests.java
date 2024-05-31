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
public class GCDRecursionTests {

    @Test
    public void testGCDWithPositiveNumbers() {
        int result = GCDRecursion.gcd(12, 18);
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void testGCDWithZero() {
        int result = GCDRecursion.gcd(0, 8);
        assertThat(result).isEqualTo(8);
    }

    @Test
    public void testGCDWithNegativeNumber() {
        try {
            GCDRecursion.gcd(-5, 10);
        } catch (ArithmeticException e) {
            assertThat(e).isInstanceOf(ArithmeticException.class);
        }
    }

    @Test
    public void testGCDWithSameNumbers() {
        int result = GCDRecursion.gcd(15, 15);
        assertThat(result).isEqualTo(15);
    }

    @Test
    public void testGCDWithLargeNumbers() {
        int result = GCDRecursion.gcd(1071, 462);
        assertThat(result).isEqualTo(21);
    }
}
