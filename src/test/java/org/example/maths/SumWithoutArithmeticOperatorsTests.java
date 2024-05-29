package org.example.maths;

import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumWithoutArithmeticOperatorsTests {

    private static SumWithoutArithmeticOperators sumCalculator;

    @BeforeAll
    public static void setup() {
        sumCalculator = new SumWithoutArithmeticOperators();
    }

    @Test
    public void testGetSum() {
        int result = sumCalculator.getSum(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testGetSumWithNegativeNumbers() {
        int result = sumCalculator.getSum(-5, -3);
        assertEquals(-8, result);
    }

    @Test
    public void testGetSumWithZero() {
        int result = sumCalculator.getSum(0, 10);
        assertEquals(10, result);
    }
}
