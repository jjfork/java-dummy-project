package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BinaryToDecimalTests {

    @Test
    void testBinaryToDecimal() {
        // Arrange
        long input = 1010L;
        long expected = 10L;

        // Act
        long result = BinaryToDecimal.binaryToDecimal(input);

        // Assert
        assertThat(result).isEqualTo(expected);
    }
}