package org.example.conversions;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class DecimalToAnyBaseTests {

    @Test
    public void testConvertToAnyBase() {
        // Given
        int inp = 10;
        int base = 2;

        // When
        String result = DecimalToAnyBase.convertToAnyBase(inp, base);

        // Then
        assertThat(result).isEqualTo("1010");
    }

    @Test
    public void testReVal() {
        // Given
        int num = 15;

        // When
        char result = DecimalToAnyBase.reVal(num);

        // Then
        assertThat(result).isEqualTo('F');
    }
}