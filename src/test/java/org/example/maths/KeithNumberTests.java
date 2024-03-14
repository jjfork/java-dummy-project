package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class KeithNumberTests {

    @Test
    void testIsKeith_whenNumberIsKeith_thenReturnTrue() {
        // Arrange
        int x = 197;
        
        // Act
        boolean result = KeithNumber.isKeith(x);
        
        // Assert
        assertThat(result).isTrue();
    }

    @Test
    void testIsKeith_whenNumberIsNotKeith_thenReturnFalse() {
        // Arrange
        int x = 123;
        
        // Act
        boolean result = KeithNumber.isKeith(x);
        
        // Assert
        assertThat(result).isFalse();
    }
}