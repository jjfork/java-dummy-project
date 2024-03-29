package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BinaryToDecimalTests {

    @Test
    void testBinaryToDecimal_WhenValidBinaryNumber_ThenReturnDecimalValue() {
        // Arrange
        long binaryNumber = 1010L;
        
        // Act
        long result = BinaryToDecimal.binaryToDecimal(binaryNumber);
        
        // Assert
        assertThat(result).isEqualTo(10L);
    }
    
    @Test
    void testBinaryToDecimal_WhenZeroBinaryNumber_ThenReturnZero() {
        // Arrange
        long binaryNumber = 0L;
        
        // Act
        long result = BinaryToDecimal.binaryToDecimal(binaryNumber);
        
        // Assert
        assertThat(result).isZero();
    }
    
    @Test
    void testBinaryToDecimal_WhenLargeBinaryNumber_ThenReturnDecimalValue() {
        // Arrange
        long binaryNumber = 110110L;
        
        // Act
        long result = BinaryToDecimal.binaryToDecimal(binaryNumber);
        
        // Assert
        assertThat(result).isEqualTo(54L);
    }
}