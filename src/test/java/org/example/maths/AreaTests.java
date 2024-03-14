package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AreaTests {

    @Test
    public void testSurfaceAreaCube() {
        // Given
        double sideLength = 5.0;

        // When
        double result = Area.surfaceAreaCube(sideLength);

        // Then
        assertThat(result).isEqualTo(150.0);
    }

    @Test
    public void testSurfaceAreaSphere() {
        // Given
        double radius = 3.0;

        // When
        double result = Area.surfaceAreaSphere(radius);

        // Then
        assertThat(result).isEqualTo(113.09733552923255);
    }

    @Test
    public void testSurfaceAreaRectangle() {
        // Given
        double length = 4.0;
        double width = 6.0;

        // When
        double result = Area.surfaceAreaRectangle(length, width);

        // Then
        assertThat(result).isEqualTo(24.0);
    }

    // Additional tests for other methods can be added here
}