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

public class ReverseNumberTests {

    @Test
    public void testReverseNumber() {
        assertEquals(321, ReverseNumber.reverseNumber(123));
    }

    @Test
    public void testReverseNumberWithZero() {
        assertEquals(0, ReverseNumber.reverseNumber(0));
    }

    @Test
    public void testReverseNumberWithSingleDigit() {
        assertEquals(5, ReverseNumber.reverseNumber(5));
    }

    @Test
    public void testReverseNumberWithLargeNumber() {
        assertEquals(987654321, ReverseNumber.reverseNumber(123456789));
    }

    @Test
    public void testReverseNumberWithNegativeNumber() {
        assertThatThrownBy(() -> ReverseNumber.reverseNumber(-123))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("number must be nonnegative.");
    }
}