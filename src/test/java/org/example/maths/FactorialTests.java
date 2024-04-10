package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FactorialTests {

    @Test
    public void testFactorialWithPositiveNumber() {
        long result = Factorial.factorial(5);
        assertThat(result).isEqualTo(120);
    }

    @Test
    public void testFactorialWithZero() {
        long result = Factorial.factorial(0);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        assertThatThrownBy(() -> Factorial.factorial(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Input number cannot be negative");
    }
}