package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTests {

    @Test
    public void testFactorialWithZero() {
        long result = Factorial.factorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialWithPositiveNumber() {
        long result = Factorial.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        try {
            Factorial.factorial(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("Input number cannot be negative", e.getMessage());
        }
    }
}
