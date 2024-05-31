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
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CeilTests {

    @Test
    public void testCeilWholeNumber() {
        double result = Ceil.ceil(5.0);
        assertEquals(5.0, result);
    }

    @Test
    public void testCeilDecimalNumber() {
        double result = Ceil.ceil(3.5);
        assertEquals(4.0, result);
    }

    @Test
    public void testCeilNegativeNumber() {
        double result = Ceil.ceil(-2.3);
        assertEquals(-2.0, result);
    }
}
