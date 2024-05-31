package org.example.conversions;

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

public class AnyBaseToDecimalTests {

    @Test
    public void testConvertToDecimal() {
        assertEquals(10, AnyBaseToDecimal.convertToDecimal("A", 16));
        assertEquals(15, AnyBaseToDecimal.convertToDecimal("F", 16));
        assertEquals(255, AnyBaseToDecimal.convertToDecimal("FF", 16));
        assertEquals(7, AnyBaseToDecimal.convertToDecimal("111", 2));
        assertEquals(13, AnyBaseToDecimal.convertToDecimal("1101", 2));
    }

    @Test
    public void testValOfChar() {
        assertEquals(0, AnyBaseToDecimal.valOfChar('0'));
        assertEquals(9, AnyBaseToDecimal.valOfChar('9'));
        assertEquals(10, AnyBaseToDecimal.valOfChar('A'));
        assertEquals(15, AnyBaseToDecimal.valOfChar('F'));
    }
}
