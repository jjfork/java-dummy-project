package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class PerfectNumberTests {

    @Test
    public void testIsPerfectNumber() {
        // Arrange
        int number = 28;

        // Act
        boolean result = PerfectNumber.isPerfectNumber(number);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testIsPerfectNumber2() {
        // Arrange
        int number = 28;

        // Act
        boolean result = PerfectNumber.isPerfectNumber2(number);

        // Assert
        assertThat(result).isTrue();
    }
}