package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PerfectSquareTests {

    @Test
    public void testIsPerfectSquare_whenNumberIsPerfectSquare_thenReturnTrue() {
        // Arrange
        int number = 16;

        // Act
        boolean result = PerfectSquare.isPerfectSquare(number);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testIsPerfectSquare_whenNumberIsNotPerfectSquare_thenReturnFalse() {
        // Arrange
        int number = 15;

        // Act
        boolean result = PerfectSquare.isPerfectSquare(number);

        // Assert
        assertThat(result).isFalse();
    }
}