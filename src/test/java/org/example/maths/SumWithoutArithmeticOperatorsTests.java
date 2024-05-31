package org.example.maths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumWithoutArithmeticOperatorsTests {

    @Test
    public void testGetSum() {
        SumWithoutArithmeticOperators sumCalculator = new SumWithoutArithmeticOperators();
        int result = sumCalculator.getSum(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testGetSumNegativeNumbers() {
        SumWithoutArithmeticOperators sumCalculator = new SumWithoutArithmeticOperators();
        int result = sumCalculator.getSum(-5, -3);
        assertEquals(-8, result);
    }

    @Test
    public void testGetSumWithZero() {
        SumWithoutArithmeticOperators sumCalculator = new SumWithoutArithmeticOperators();
        int result = sumCalculator.getSum(10, 0);
        assertEquals(10, result);
    }

}
