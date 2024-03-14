package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class PowTests {

    @Test
    public void testPowWithPositiveNumbers() {
        // Given
        int a = 2;
        int b = 3;

        // When
        long result = Pow.pow(a, b);

        // Then
        assertThat(result).isEqualTo(8);
    }

    @Test
    public void testPowWithNegativeNumbers() {
        // Given
        int a = -2;
        int b = 3;

        // When
        long result = Pow.pow(a, b);

        // Then
        assertThat(result).isEqualTo(-8);
    }

    @Test
    public void testPowWithZeroExponent() {
        // Given
        int a = 2;
        int b = 0;

        // When
        long result = Pow.pow(a, b);

        // Then
        assertThat(result).isEqualTo(1);
    }
}