package org.example.maths;

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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PronicNumberTests {

    @Test
    void testIsPronicForPronicNumber() {
        assertTrue(PronicNumber.isPronic(6));
    }

    @Test
    void testIsPronicForNonPronicNumber() {
        assertFalse(PronicNumber.isPronic(5));
    }

    @Test
    void testIsPronicForZero() {
        assertFalse(PronicNumber.isPronic(0));
    }

    @Test
    void testIsPronicForNegativeNumber() {
        assertFalse(PronicNumber.isPronic(-10));
    }
}
