package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class FibonacciNumberCheckTests {

    @Test
    public void testIsPerfectSquare() {
        long number = 16;
        boolean result = FibonacciNumberCheck.isPerfectSquare(number);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsNotPerfectSquare() {
        long number = 15;
        boolean result = FibonacciNumberCheck.isPerfectSquare(number);
        assertThat(result).isFalse();
    }

    @Test
    public void testIsFibonacciNumber() {
        long number = 5;
        boolean result = FibonacciNumberCheck.isFibonacciNumber(number);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsNotFibonacciNumber() {
        long number = 7;
        boolean result = FibonacciNumberCheck.isFibonacciNumber(number);
        assertThat(result).isFalse();
    }
}