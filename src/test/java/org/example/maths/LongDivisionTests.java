package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LongDivisionTests {

    @Test
    public void testDivide_PositiveNumbers() {
        int result = LongDivision.divide(10, 2);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testDivide_NegativeNumbers() {
        int result = LongDivision.divide(-10, -2);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testDivide_DividendZero() {
        int result = LongDivision.divide(0, 5);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testDivide_DivisorZero() {
        int result = LongDivision.divide(10, 0);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testDivide_LargeNumbers() {
        int result = LongDivision.divide(2147483647, 2);
        assertThat(result).isEqualTo(1073741823);
    }

    @Test
    public void testDivide_LargeNegativeNumbers() {
        int result = LongDivision.divide(-2147483648, -2);
        assertThat(result).isEqualTo(1073741824);
    }
}
