package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeTests {

    @Test
    public void testVolumeCube() {
        double result = Volume.volumeCube(3);
        assertEquals(27, result);
    }

    @Test
    public void testVolumeCuboid() {
        double result = Volume.volumeCuboid(2, 3, 4);
        assertEquals(24, result);
    }

    @Test
    public void testVolumeSphere() {
        double result = Volume.volumeSphere(5);
        assertEquals(523.5987755982989, result);
    }

    @Test
    public void testVolumeCylinder() {
        double result = Volume.volumeCylinder(2, 4);
        assertEquals(50.26548245743669, result);
    }

    @Test
    public void testVolumeHemisphere() {
        double result = Volume.volumeHemisphere(3);
        assertEquals(56.548667764616276, result);
    }

    @Test
    public void testVolumeCone() {
        double result = Volume.volumeCone(3, 4);
        assertEquals(37.69911184307752, result);
    }

    @Test
    public void testVolumePrism() {
        double result = Volume.volumePrism(6, 5);
        assertEquals(30, result);
    }

    @Test
    public void testVolumePyramid() {
        double result = Volume.volumePyramid(8, 6);
        assertEquals(16, result);
    }
}