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
    public void testParseInt_WithLeadingPlusSign() {
        String input = "+789";
        int expected = 789;

        int result = ParseInteger.parseInt(input);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testParseInt_InvalidInput_Null() {
        String input = null;

        assertThatThrownBy(() -> ParseInteger.parseInt(input))
                .isInstanceOf(NumberFormatException.class)
                .hasMessage("Input parameter must not be null!");
    }

    @Test
    public void testParseInt_InvalidInput_Empty() {
        String input = "";

        assertThatThrownBy(() -> ParseInteger.parseInt(input))
                .isInstanceOf(NumberFormatException.class)
                .hasMessage("Input parameter must not be empty!");
    }

    @Test
    public void testParseInt_InvalidInput_NonDigit() {
        String input = "abc";

        assertThatThrownBy(() -> ParseInteger.parseInt(input))
                .isInstanceOf(NumberFormatException.class)
                .hasMessage("Input parameter of incorrect format: abc");
    }
}