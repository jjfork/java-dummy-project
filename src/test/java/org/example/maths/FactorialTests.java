package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FactorialTests {

    @Test
    public void testFactorialWithPositiveNumber() {
        // Arrange
        int n = 5;
        
        // Act
        long result = Factorial.factorial(n);
        
        // Assert
        assertEquals(120, result);
    }
    
    @Test
    public void testFactorialWithZero() {
        // Arrange
        int n = 0;
        
        // Act
        long result = Factorial.factorial(n);
        
        // Assert
        assertEquals(1, result);
    }
    
    @Test
    public void testFactorialWithNegativeNumber() {
        // Arrange
        int n = -5;
        
        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(n));
    }
}