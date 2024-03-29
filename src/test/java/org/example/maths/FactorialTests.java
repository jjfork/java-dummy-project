package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class FactorialTests {

    @Test
    public void testFactorialWithPositiveNumber() {
        int n = 5;
        long result = Factorial.factorial(n);
        assertThat(result).isEqualTo(120);
    }

    @Test
    public void testFactorialWithZero() {
        int n = 0;
        long result = Factorial.factorial(n);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        int n = -5;
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(n));
    }
}