package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
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