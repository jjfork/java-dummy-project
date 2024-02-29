package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DigitalRootTests {

    @Test
    void testDigitalRoot() {
        // Arrange
        int input = 942;
        int expected = 6;

        // Act
        int result = DigitalRoot.digitalRoot(input);

        // Assert
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testSingle() {
        // Arrange
        int input = 942;
        int expected = 15;

        // Act
        int result = DigitalRoot.single(input);

        // Assert
        assertThat(result).isEqualTo(expected);
    }
}