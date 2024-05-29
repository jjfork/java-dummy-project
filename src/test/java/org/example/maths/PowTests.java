package org.example.maths;

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

public class PowTests {

    @Test
    public void testPow() {
        assertEquals(1, Pow.pow(2, 0));
        assertEquals(2, Pow.pow(2, 1));
        assertEquals(4, Pow.pow(2, 2));
        assertEquals(8, Pow.pow(2, 3));
        assertEquals(16, Pow.pow(2, 4));
    }
}