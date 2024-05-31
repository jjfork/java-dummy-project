package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class ParseIntegerTests {

    @Test
    public void testParseInt_PositiveNumber() {
        String input = "123";
        int expected = 123;

        int result = ParseInteger.parseInt(input);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testParseInt_NegativeNumber() {
        String input = "-456";
        int expected = -456;

        int result = ParseInteger.parseInt(input);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testParseInt_WithLeadingZeros() {
        String input = "007";
        int expected = 7;

        int result = ParseInteger.parseInt(input);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testParseInt_InvalidInput_Null() {
        String input = null;

        assertThrows(NumberFormatException.class, () -> ParseInteger.parseInt(input));
    }

    @Test
    public void testParseInt_InvalidInput_Empty() {
        String input = "";

        assertThrows(NumberFormatException.class, () -> ParseInteger.parseInt(input));
    }

    @Test
    public void testParseInt_InvalidInput_NonDigit() {
        String input = "abc";

        assertThrows(NumberFormatException.class, () -> ParseInteger.parseInt(input));
    }
}
