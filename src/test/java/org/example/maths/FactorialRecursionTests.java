package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class FactorialRecursionTests {

    @Test
    public void testFactorialWithPositiveNumber() {
        // Arrange
        int n = 5;
        
        // Act
        long result = FactorialRecursion.factorial(n);
        
        // Assert
        assertThat(result).isEqualTo(120);
    }

    @Test
    public void testFactorialWithZero() {
        // Arrange
        int n = 0;
        
        // Act
        long result = FactorialRecursion.factorial(n);
        
        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        // Arrange
        int n = -5;
        
        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialRecursion.factorial(n);
        });
        assertThat(exception.getMessage()).isEqualTo("number is negative");
    }
}