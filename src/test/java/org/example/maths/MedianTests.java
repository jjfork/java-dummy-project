package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MedianTests {

    @Test
    public void testMedian_oddLength() {
        // Given
        int[] values = {3, 1, 2, 5, 4};
        
        // When
        double result = Median.median(values);
        
        // Then
        assertThat(result).isEqualTo(3.0);
    }

    @Test
    public void testMedian_evenLength() {
        // Given
        int[] values = {3, 1, 2, 5, 4, 6};
        
        // When
        double result = Median.median(values);
        
        // Then
        assertThat(result).isEqualTo(3.5);
    }
}