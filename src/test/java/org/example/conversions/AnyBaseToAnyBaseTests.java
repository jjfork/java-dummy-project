package org.example.conversions;

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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AnyBaseToAnyBaseTests {

    @Test
    public void testValidForBase_ValidNumber_ReturnsTrue() {
        String n = "12345";
        int base = 10;

        boolean result = AnyBaseToAnyBase.validForBase(n, base);

        assertThat(result).isTrue();
    }

    @Test
    public void testValidForBase_InvalidNumber_ReturnsFalse() {
        String n = "12A45";
        int base = 10;

        boolean result = AnyBaseToAnyBase.validForBase(n, base);

        assertThat(result).isFalse();
    }

    @Test
    public void testBase2Base_ConvertsNumberCorrectly() {
        String n = "1010";
        int b1 = 2;
        int b2 = 10;

        String result = AnyBaseToAnyBase.base2base(n, b1, b2);

        assertThat(result).isEqualTo("10");
    }

    @Test
    public void testBase2Base_ConvertsNumberWithLettersCorrectly() {
        String n = "1A";
        int b1 = 16;
        int b2 = 10;

        String result = AnyBaseToAnyBase.base2base(n, b1, b2);

        assertThat(result).isEqualTo("26");
    }
}
