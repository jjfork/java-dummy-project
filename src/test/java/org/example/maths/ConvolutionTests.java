package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ConvolutionTests {

    @Test
    public void testConvolution() {
        // Given
        double[] A = {1, 2, 3};
        double[] B = {4, 5, 6};

        // When
        double[] result = Convolution.convolution(A, B);

        // Then
        assertThat(result).containsExactly(4, 13, 28, 27, 18);
    }
}