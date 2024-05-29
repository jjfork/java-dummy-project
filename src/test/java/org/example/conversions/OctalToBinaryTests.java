package org.example.conversions;

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

public class OctalToBinaryTests {

    @Test
    public void testConvertOctalToBinary() {
        assertEquals(0, OctalToBinary.convertOctalToBinary(0));
        assertEquals(1, OctalToBinary.convertOctalToBinary(1));
        assertEquals(10, OctalToBinary.convertOctalToBinary(2));
        assertEquals(11, OctalToBinary.convertOctalToBinary(3));
        assertEquals(100, OctalToBinary.convertOctalToBinary(4));
        assertEquals(101, OctalToBinary.convertOctalToBinary(5));
        assertEquals(110, OctalToBinary.convertOctalToBinary(6));
        assertEquals(111, OctalToBinary.convertOctalToBinary(7));
        assertEquals(1000, OctalToBinary.convertOctalToBinary(10));
    }

    @Test
    public void testConvertOctalDigitToBinary() {
        assertEquals(0, OctalToBinary.convertOctalDigitToBinary(0));
        assertEquals(1, OctalToBinary.convertOctalDigitToBinary(1));
        assertEquals(10, OctalToBinary.convertOctalDigitToBinary(2));
        assertEquals(11, OctalToBinary.convertOctalDigitToBinary(3));
        assertEquals(100, OctalToBinary.convertOctalDigitToBinary(4));
        assertEquals(101, OctalToBinary.convertOctalDigitToBinary(5));
        assertEquals(110, OctalToBinary.convertOctalDigitToBinary(6));
        assertEquals(111, OctalToBinary.convertOctalDigitToBinary(7));
    }
}
