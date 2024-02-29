package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BinaryPowTests {

    @Test
    public void testBinPow() {
        // Given
        int a = 2;
        int p = 3;
        
        // When
        int result = BinaryPow.binPow(a, p);
        
        // Then
        assertThat(result).isEqualTo(8);
    }
}