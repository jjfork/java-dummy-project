package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AreaTests {

    @Test
    public void testSurfaceAreaCube() {
        double result = Area.surfaceAreaCube(2.0);
        assertThat(result).isEqualTo(24.0);
    }

    @Test
    public void testSurfaceAreaSphere() {
        double result = Area.surfaceAreaSphere(3.0);
        assertThat(result).isEqualTo(113.09733552923255);
    }

    @Test
    public void testSurfaceAreaRectangle() {
        double result = Area.surfaceAreaRectangle(4.0, 5.0);
        assertThat(result).isEqualTo(20.0);
    }

    @Test
    public void testSurfaceAreaCylinder() {
        double result = Area.surfaceAreaCylinder(2.0, 3.0);
        assertThat(result).isEqualTo(62.83185307179586);
    }

    @Test
    public void testSurfaceAreaSquare() {
        double result = Area.surfaceAreaSquare(4.0);
        assertThat(result).isEqualTo(16.0);
    }

    @Test
    public void testSurfaceAreaTriangle() {
        double result = Area.surfaceAreaTriangle(3.0, 4.0);
        assertThat(result).isEqualTo(6.0);
    }

    @Test
    public void testSurfaceAreaParallelogram() {
        double result = Area.surfaceAreaParallelogram(4.0, 5.0);
        assertThat(result).isEqualTo(20.0);
    }

    @Test
    public void testSurfaceAreaTrapezium() {
        double result = Area.surfaceAreaTrapezium(3.0, 4.0, 5.0);
        assertThat(result).isEqualTo(17.5);
    }

    @Test
    public void testSurfaceAreaCircle() {
        double result = Area.surfaceAreaCircle(3.0);
        assertThat(result).isEqualTo(28.274333882308138);
    }

    @Test
    public void testSurfaceAreaHemisphere() {
        double result = Area.surfaceAreaHemisphere(3.0);
        assertThat(result).isEqualTo(84.82300164692441);
    }

    @Test
    public void testSurfaceAreaCone() {
        double result = Area.surfaceAreaCone(3.0, 4.0);
        assertThat(result).isEqualTo(75.39822368615503);
    }

    @Test
    public void testSurfaceAreaCube_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCube(-2.0));
    }

    @Test
    public void testSurfaceAreaSphere_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaSphere(-3.0));
    }

    @Test
    public void testSurfaceAreaRectangle_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaRectangle(-4.0, 5.0));
    }

    @Test
    public void testSurfaceAreaCylinder_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCylinder(2.0, -3.0));
    }

    @Test
    public void testSurfaceAreaSquare_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaSquare(-4.0));
    }

    @Test
    public void testSurfaceAreaTriangle_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTriangle(-3.0, 4.0));
    }

    @Test
    public void testSurfaceAreaParallelogram_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaParallelogram(-4.0, 5.0));
    }

    @Test
    public void testSurfaceAreaTrapezium_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTrapezium(-3.0, 4.0, 5.0));
    }

    @Test
    public void testSurfaceAreaCircle_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCircle(-3.0));
    }

    @Test
    public void testSurfaceAreaHemisphere_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaHemisphere(-3.0));
    }

    @Test
    public void testSurfaceAreaCone_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCone(3.0, -4.0));
    }
}
