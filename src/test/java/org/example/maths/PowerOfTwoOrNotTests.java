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

public class PowerOfTwoOrNotTests {

    @Test
    public void testCheckIfPowerOfTwoOrNot_PositiveNumber() {
        assertTrue(PowerOfTwoOrNot.checkIfPowerOfTwoOrNot(4));
    }

    @Test
    public void testCheckIfPowerOfTwoOrNot_NegativeNumber() {
        assertFalse(PowerOfTwoOrNot.checkIfPowerOfTwoOrNot(-8));
    }

    @Test
    public void testCheckIfPowerOfTwoOrNot_Zero() {
        assertFalse(PowerOfTwoOrNot.checkIfPowerOfTwoOrNot(0));
    }

    @Test
    public void testCheckIfPowerOfTwoOrNot_NotPowerOfTwo() {
        assertFalse(PowerOfTwoOrNot.checkIfPowerOfTwoOrNot(5));
    }
}