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

public class ParseIntegerTests {

    @Test
    public void testPositiveNumber() {
        String input = "123";
        int expected = 123;
        int result = ParseInteger.parseInt(input);
        assertEquals(expected, result);
    }

    @Test
    public void testNegativeNumber() {
        String input = "-456";
        int expected = -456;
        int result = ParseInteger.parseInt(input);
        assertEquals(expected, result);
    }

    @Test
    public void testZero() {
        String input = "0";
        int expected = 0;
        int result = ParseInteger.parseInt(input);
        assertEquals(expected, result);
    }

    @Test
    public void testInvalidInput_Null() {
        String input = null;
        assertThrows(NumberFormatException.class, () -> {
            ParseInteger.parseInt(input);
        });
    }

    @Test
    public void testInvalidInput_Empty() {
        String input = "";
        assertThrows(NumberFormatException.class, () -> {
            ParseInteger.parseInt(input);
        });
    }

    @Test
    public void testInvalidInput_Format() {
        String input = "abc";
        assertThrows(NumberFormatException.class, () -> {
            ParseInteger.parseInt(input);
        });
    }
}