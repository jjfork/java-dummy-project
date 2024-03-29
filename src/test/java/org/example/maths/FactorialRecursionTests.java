package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class FactorialRecursionTests {

    @Test
    public void testFactorialWithZero() {
        long result = FactorialRecursion.factorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialWithPositiveNumber() {
        long result = FactorialRecursion.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialRecursion.factorial(-5);
        });
    }
}