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
