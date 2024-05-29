package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AbsoluteMinTests {

    @Test
    public void testGetMinValue_withPositiveNumbers() {
        int result = AbsoluteMin.getMinValue(5, 10, 3, 8);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void testGetMinValue_withNegativeNumbers() {
        int result = AbsoluteMin.getMinValue(-5, -10, -3, -8);
        assertThat(result).isEqualTo(-3);
    }

    @Test
    public void testGetMinValue_withMixedNumbers() {
        int result = AbsoluteMin.getMinValue(-5, 10, -3, 8);
        assertThat(result).isEqualTo(-3);
    }

    @Test
    public void testGetMinValue_withSingleNumber() {
        int result = AbsoluteMin.getMinValue(5);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testGetMinValue_withZero() {
        int result = AbsoluteMin.getMinValue(0, 10, 3, 8);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testGetMinValue_withEmptyArray() {
        try {
            AbsoluteMin.getMinValue();
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Numbers array cannot be empty");
        }
    }
}
