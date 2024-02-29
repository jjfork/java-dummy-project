package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GCDTests {

    @Test
    public void testGcdForPositiveNumbers() {
        int result = GCD.gcd(12, 18);
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void testGcdForZero() {
        int result = GCD.gcd(0, 8);
        assertThat(result).isEqualTo(8);
    }

    @Test
    public void testGcdForNegativeNumbers() {
        try {
            GCD.gcd(-12, 18);
        } catch (ArithmeticException e) {
            assertThat(e).isInstanceOf(ArithmeticException.class);
        }
    }

    @Test
    public void testGcdForArray() {
        int[] numbers = {24, 36, 48};
        int result = GCD.gcd(numbers);
        assertThat(result).isEqualTo(12);
    }
}