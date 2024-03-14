package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class ReverseNumberTests {

    @Test
    public void reverseNumber_WithPositiveNumber_ShouldReturnReversedNumber() {
        // Arrange
        int number = 12345;

        // Act
        int result = ReverseNumber.reverseNumber(number);

        // Assert
        assertThat(result).isEqualTo(54321);
    }

    @Test
    public void reverseNumber_WithZero_ShouldReturnZero() {
        // Arrange
        int number = 0;

        // Act
        int result = ReverseNumber.reverseNumber(number);

        // Assert
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void reverseNumber_WithNegativeNumber_ShouldThrowIllegalArgumentException() {
        // Arrange
        int number = -123;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> ReverseNumber.reverseNumber(number));
    }
}