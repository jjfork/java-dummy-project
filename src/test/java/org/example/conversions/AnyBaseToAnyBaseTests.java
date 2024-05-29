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

public class AnyBaseToAnyBaseTests {

    @Test
    public void testValidForBase_ValidNumberForBase_ReturnsTrue() {
        // Given
        String number = "12345";
        int base = 10;

        // When
        boolean result = AnyBaseToAnyBase.validForBase(number, base);

        // Then
        assertEquals(true, result);
    }

    @Test
    public void testValidForBase_InvalidNumberForBase_ReturnsFalse() {
        // Given
        String number = "12A45";
        int base = 10;

        // When
        boolean result = AnyBaseToAnyBase.validForBase(number, base);

        // Then
        assertEquals(false, result);
    }

    @Test
    public void testBase2Base_ConvertsNumberFromBase2ToBase16() {
        // Given
        String number = "1101";
        int base1 = 2;
        int base2 = 16;

        // When
        String result = AnyBaseToAnyBase.base2base(number, base1, base2);

        // Then
        assertEquals("D", result);
    }

    @Test
    public void testBase2Base_ConvertsNumberFromBase10ToBase2() {
        // Given
        String number = "10";
        int base1 = 10;
        int base2 = 2;

        // When
        String result = AnyBaseToAnyBase.base2base(number, base1, base2);

        // Then
        assertEquals("1010", result);
    }
}
