package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class PowTests {

    @Test
    public void testPow() {
        // Given
        int a = 2;
        int b = 3;
        
        // When
        long result = Pow.pow(a, b);
        
        // Then
        assertEquals(8, result);
    }
}