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
public class LongDivisionTests {

    @Test
    public void testDivide() {
        assertThat(LongDivision.divide(10, 2)).isEqualTo(5);
        assertThat(LongDivision.divide(7, 3)).isEqualTo(2);
        assertThat(LongDivision.divide(15, 5)).isEqualTo(3);
        assertThat(LongDivision.divide(20, 4)).isEqualTo(5);
        assertThat(LongDivision.divide(0, 5)).isEqualTo(0);
        assertThat(LongDivision.divide(-10, 2)).isEqualTo(-5);
        assertThat(LongDivision.divide(10, -2)).isEqualTo(-5);
        assertThat(LongDivision.divide(-10, -2)).isEqualTo(5);
        assertThat(LongDivision.divide(2147483647, 1)).isEqualTo(2147483647);
        assertThat(LongDivision.divide(-2147483648, 1)).isEqualTo(-2147483648);
    }
}