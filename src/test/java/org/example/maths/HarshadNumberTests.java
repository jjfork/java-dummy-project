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
public class HarshadNumberTests {

    @Test
    public void testIsHarshadWithLong_ValidInput_ReturnsTrue() {
        assertTrue(HarshadNumber.isHarshad(18));
    }

    @Test
    public void testIsHarshadWithLong_InvalidInput_ReturnsFalse() {
        assertFalse(HarshadNumber.isHarshad(-5));
    }

    @Test
    public void testIsHarshadWithString_ValidInput_ReturnsTrue() {
        assertTrue(HarshadNumber.isHarshad("18"));
    }

    @Test
    public void testIsHarshadWithString_InvalidInput_ReturnsFalse() {
        assertFalse(HarshadNumber.isHarshad("-5"));
    }
}
