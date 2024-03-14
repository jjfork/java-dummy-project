package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class ParseIntegerTests {

    @Test
    public void testPositiveNumber() {
        String input = "123";
        int expected = 123;
        int result = ParseInteger.parseInt(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testNegativeNumber() {
        String input = "-456";
        int expected = -456;
        int result = ParseInteger.parseInt(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testWithPlusSign() {
        String input = "+789";
        int expected = 789;
        int result = ParseInteger.parseInt(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testWithLeadingZeros() {
        String input = "00123";
        int expected = 123;
        int result = ParseInteger.parseInt(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testWithInvalidInput() {
        String input = "12A3";
        assertThrows(NumberFormatException.class, () -> ParseInteger.parseInt(input));
    }

    @Test
    public void testWithEmptyInput() {
        String input = "";
        assertThrows(NumberFormatException.class, () -> ParseInteger.parseInt(input));
    }

    @Test
    public void testWithNullInput() {
        String input = null;
        assertThrows(NumberFormatException.class, () -> ParseInteger.parseInt(input));
    }
}