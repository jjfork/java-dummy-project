package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FactorialRecursionTests {

    @Test
    public void testFactorialWithZero() {
        long result = FactorialRecursion.factorial(0);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testFactorialWithPositiveNumber() {
        long result = FactorialRecursion.factorial(5);
        assertThat(result).isEqualTo(120);
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FactorialRecursion.factorial(-5));
    }
}
