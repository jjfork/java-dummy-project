package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PythagoreanTripleTests {

    @Test
    public void testIsPythagTriple_WhenAllPositive_ReturnsTrue() {
        // Arrange
        int a = 3;
        int b = 4;
        int c = 5;

        // Act
        boolean result = PythagoreanTriple.isPythagTriple(a, b, c);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testIsPythagTriple_WhenOneNegative_ReturnsFalse() {
        // Arrange
        int a = -3;
        int b = 4;
        int c = 5;

        // Act
        boolean result = PythagoreanTriple.isPythagTriple(a, b, c);

        // Assert
        assertThat(result).isFalse();
    }

    @Test
    public void testIsPythagTriple_WhenNotPythagorean_ReturnsFalse() {
        // Arrange
        int a = 3;
        int b = 4;
        int c = 6;

        // Act
        boolean result = PythagoreanTriple.isPythagTriple(a, b, c);

        // Assert
        assertThat(result).isFalse();
    }
}