package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class FactorialTests {

    @Test
    public void testFactorialWithPositiveNumber() {
        // Given
        int n = 5;
        
        // When
        long result = Factorial.factorial(n);
        
        // Then
        assertThat(result).isEqualTo(120);
    }

    @Test
    public void testFactorialWithZero() {
        // Given
        int n = 0;
        
        // When
        long result = Factorial.factorial(n);
        
        // Then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        // Given
        int n = -5;
        
        // Then
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(n));
    }
}