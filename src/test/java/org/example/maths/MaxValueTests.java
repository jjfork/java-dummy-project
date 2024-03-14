package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MaxValueTests {

    @Test
    public void testMax_WhenAIsGreater_ShouldReturnA() {
        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = MaxValue.max(a, b);

        // Assert
        assertThat(result).isEqualTo(a);
    }

    @Test
    public void testMax_WhenBIsGreater_ShouldReturnB() {
        // Arrange
        int a = 2;
        int b = 8;

        // Act
        int result = MaxValue.max(a, b);

        // Assert
        assertThat(result).isEqualTo(b);
    }
}