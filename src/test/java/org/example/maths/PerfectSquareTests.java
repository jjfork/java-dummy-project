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

public class PerfectSquareTests {

    @Test
    public void testIsPerfectSquare_whenNumberIsPerfectSquare_thenTrue() {
        assertTrue(PerfectSquare.isPerfectSquare(4));
        assertTrue(PerfectSquare.isPerfectSquare(9));
        assertTrue(PerfectSquare.isPerfectSquare(16));
    }

    @Test
    public void testIsPerfectSquare_whenNumberIsNotPerfectSquare_thenFalse() {
        assertFalse(PerfectSquare.isPerfectSquare(5));
        assertFalse(PerfectSquare.isPerfectSquare(10));
        assertFalse(PerfectSquare.isPerfectSquare(15));
    }
}