package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class HarshadNumberTests {

    @Test
    public void testIsHarshadForLong() {
        // Arrange
        long input = 18;

        // Act
        boolean result = HarshadNumber.isHarshad(input);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testIsHarshadForLongNegative() {
        // Arrange
        long input = -18;

        // Act
        boolean result = HarshadNumber.isHarshad(input);

        // Assert
        assertThat(result).isFalse();
    }

    @Test
    public void testIsHarshadForString() {
        // Arrange
        String input = "18";

        // Act
        boolean result = HarshadNumber.isHarshad(input);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testIsHarshadForStringNegative() {
        // Arrange
        String input = "-18";

        // Act
        boolean result = HarshadNumber.isHarshad(input);

        // Assert
        assertThat(result).isFalse();
    }
}