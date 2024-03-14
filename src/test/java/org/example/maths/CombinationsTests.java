package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CombinationsTests {

    @Test
    public void testFactorial() {
        // Arrange
        int n = 5;
        
        // Act
        long result = Combinations.factorial(n);
        
        // Assert
        assertThat(result).isEqualTo(120);
    }

    @Test
    public void testCombinations() {
        // Arrange
        int n = 5;
        int k = 2;
        
        // Act
        long result = Combinations.combinations(n, k);
        
        // Assert
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void testCombinationsOptimized() {
        // Arrange
        int n = 5;
        int k = 2;
        
        // Act
        long result = Combinations.combinationsOptimized(n, k);
        
        // Assert
        assertThat(result).isEqualTo(10);
    }
}