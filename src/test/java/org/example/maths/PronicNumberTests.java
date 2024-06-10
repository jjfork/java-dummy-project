package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PronicNumberTests {

    @Test
    void testIsPronic_whenInputIsPronicNumber_thenTrue() {
        int inputNumber = 6;
        boolean result = PronicNumber.isPronic(inputNumber);
        assertTrue(result);
    }

    @Test
    void testIsPronic_whenInputIsNotPronicNumber_thenFalse() {
        int inputNumber = 5;
        boolean result = PronicNumber.isPronic(inputNumber);
        assertFalse(result);
    }

    @Test
    void testIsPronic_whenInputIsZero_thenFalse() {
        int inputNumber = 0;
        boolean result = PronicNumber.isPronic(inputNumber);
        assertFalse(result);
    }
}