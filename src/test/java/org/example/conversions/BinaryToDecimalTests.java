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

class BinaryToDecimalTests {

    @Test
    void testBinaryToDecimal() {
        long input = 1010L;
        long expected = 10L;
        long result = BinaryToDecimal.binaryToDecimal(input);
        assertEquals(expected, result);
    }

    @Test
    void testBinaryToDecimalWithZero() {
        long input = 0L;
        long expected = 0L;
        long result = BinaryToDecimal.binaryToDecimal(input);
        assertEquals(expected, result);
    }

    @Test
    void testBinaryToDecimalWithLargeNumber() {
        long input = 1101101101L;
        long expected = 877L;
        long result = BinaryToDecimal.binaryToDecimal(input);
        assertEquals(expected, result);
    }
}
