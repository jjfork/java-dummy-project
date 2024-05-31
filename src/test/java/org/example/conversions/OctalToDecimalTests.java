package org.example.conversions;

import static org.assertj.core.api.Assertions.assertThat;
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

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class OctalToDecimalTests {

    @Test
    public void testConvertOctalToDecimal_validInput() {
        String inputOctal = "10";
        int expected = 8;
        int result = OctalToDecimal.convertOctalToDecimal(inputOctal);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertOctalToDecimal_invalidInput() {
        String inputOctal = "8";
        int expected = -1;
        int result = OctalToDecimal.convertOctalToDecimal(inputOctal);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertOctalToDecimal_emptyInput() {
        String inputOctal = "";
        int expected = -1;
        int result = OctalToDecimal.convertOctalToDecimal(inputOctal);
        assertEquals(expected, result);
    }
}
