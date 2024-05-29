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

public class IntegerToRomanTests {

    @Test
    public void testIntegerToRoman() {
        assertEquals("III", IntegerToRoman.integerToRoman(3));
        assertEquals("IV", IntegerToRoman.integerToRoman(4));
        assertEquals("IX", IntegerToRoman.integerToRoman(9));
        assertEquals("LVIII", IntegerToRoman.integerToRoman(58));
        assertEquals("MCMXCIV", IntegerToRoman.integerToRoman(1994));
    }
}
