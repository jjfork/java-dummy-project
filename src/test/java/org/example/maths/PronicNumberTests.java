package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PronicNumberTests {

    @Test
    void testIsPronicForPronicNumber() {
        // Arrange
        int inputNumber = 6;

        // Act
        boolean result = PronicNumber.isPronic(inputNumber);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    void testIsPronicForNonPronicNumber() {
        // Arrange
        int inputNumber = 5;

        // Act
        boolean result = PronicNumber.isPronic(inputNumber);

        // Assert
        assertThat(result).isFalse();
    }
}