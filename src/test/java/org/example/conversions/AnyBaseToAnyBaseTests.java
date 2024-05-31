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

public class AnyBaseToAnyBaseTests {

    @Test
    public void testValidForBase_ValidNumberForBase_ReturnsTrue() {
        String n = "12345";
        int base = 10;
        boolean result = AnyBaseToAnyBase.validForBase(n, base);
        assertEquals(true, result);
    }

    @Test
    public void testValidForBase_InvalidNumberForBase_ReturnsFalse() {
        String n = "12A45";
        int base = 10;
        boolean result = AnyBaseToAnyBase.validForBase(n, base);
        assertEquals(false, result);
    }

    @Test
    public void testBase2Base_ConvertsNumberFromBase2ToBase16() {
        String n = "1101";
        int b1 = 2;
        int b2 = 16;
        String result = AnyBaseToAnyBase.base2base(n, b1, b2);
        assertEquals("D", result);
    }

    @Test
    public void testBase2Base_ConvertsNumberFromBase10ToBase2() {
        String n = "10";
        int b1 = 10;
        int b2 = 2;
        String result = AnyBaseToAnyBase.base2base(n, b1, b2);
        assertEquals("1010", result);
    }

}
