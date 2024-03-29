package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LongDivisionTests {

    @Test
    public void testDivide_PositiveNumbers_ReturnsCorrectResult() {
        int dividend = 10;
        int divisor = 2;
        int result = LongDivision.divide(dividend, divisor);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testDivide_NegativeDividend_ReturnsCorrectResult() {
        int dividend = -10;
        int divisor = 2;
        int result = LongDivision.divide(dividend, divisor);
        assertThat(result).isEqualTo(-5);
    }

    @Test
    public void testDivide_DivisorZero_ReturnsZero() {
        int dividend = 10;
        int divisor = 0;
        int result = LongDivision.divide(dividend, divisor);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testDivide_MaximumValue_ReturnsMaxInteger() {
        int dividend = Integer.MAX_VALUE;
        int divisor = 1;
        int result = LongDivision.divide(dividend, divisor);
        assertThat(result).isEqualTo(Integer.MAX_VALUE);
    }

    @Test
    public void testDivide_MinimumValue_ReturnsMinInteger() {
        int dividend = Integer.MIN_VALUE;
        int divisor = 1;
        int result = LongDivision.divide(dividend, divisor);
        assertThat(result).isEqualTo(Integer.MIN_VALUE);
    }
}