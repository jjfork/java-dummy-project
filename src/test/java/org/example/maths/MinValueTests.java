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

public class MinValueTests {

    @Test
    public void testMinValueWithFirstSmaller() {
        int result = MinValue.min(2, 5);
        assertEquals(2, result);
    }

    @Test
    public void testMinValueWithSecondSmaller() {
        int result = MinValue.min(8, 3);
        assertEquals(3, result);
    }

    @Test
    public void testMinValueWithEqualValues() {
        int result = MinValue.min(4, 4);
        assertEquals(4, result);
    }
}
