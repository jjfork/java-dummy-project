package org.example.divideandconquer;

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

public class BinaryExponentiationTests {

    @Test
    void testCalculatePower() {
        long result = BinaryExponentiation.calculatePower(2, 3);
        assertEquals(8, result);
    }

    @Test
    void testPower() {
        BinaryExponentiation binaryExponentiation = new BinaryExponentiation();
        long result = binaryExponentiation.power(2, 3);
        assertEquals(8, result);
    }
}