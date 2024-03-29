package org.example.maths;

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
    public void testIsFibonacciNumber() {
        long number = 5;
        boolean result = FibonacciNumberCheck.isFibonacciNumber(number);
        assertThat(result).isTrue();
    }
}