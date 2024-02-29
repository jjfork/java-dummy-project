package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GCDRecursionTests {

    @Test
    public void testGCDWithPositiveNumbers() {
        int result = GCDRecursion.gcd(12, 8);
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void testGCDWithZero() {
        int result = GCDRecursion.gcd(0, 5);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testGCDWithNegativeNumber() {
        try {
            GCDRecursion.gcd(-10, 15);
        } catch (ArithmeticException e) {
            assertThat(e).isInstanceOf(ArithmeticException.class);
        }
    }

    @Test
    public void testGCDWithSameNumbers() {
        int result = GCDRecursion.gcd(20, 20);
        assertThat(result).isEqualTo(20);
    }
}