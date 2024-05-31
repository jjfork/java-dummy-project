package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class VolumeTests {

    @Test
    public void testVolumeCube() {
        double result = Volume.volumeCube(3.0);
        assertThat(result).isEqualTo(27.0);
    }

    @Test
    public void testVolumeCuboid() {
        double result = Volume.volumeCuboid(2.0, 3.0, 4.0);
        assertThat(result).isEqualTo(24.0);
    }

    @Test
    public void testVolumeSphere() {
        double result = Volume.volumeSphere(2.0);
        assertThat(result).isEqualTo((4 * Math.PI * 8) / 3);
    }

    @Test
    public void testVolumeCylinder() {
        double result = Volume.volumeCylinder(2.0, 3.0);
        assertThat(result).isEqualTo(Math.PI * 12);
    }

    @Test
    public void testVolumeHemisphere() {
        double result = Volume.volumeHemisphere(2.0);
        assertThat(result).isEqualTo((2 * Math.PI * 8) / 3);
    }

    @Test
    public void testVolumeCone() {
        double result = Volume.volumeCone(2.0, 3.0);
        assertThat(result).isEqualTo((Math.PI * 12) / 3);
    }

    @Test
    public void testVolumePrism() {
        double result = Volume.volumePrism(6.0, 4.0);
        assertThat(result).isEqualTo(24.0);
    }

    @Test
    public void testVolumePyramid() {
        double result = Volume.volumePyramid(6.0, 4.0);
        assertThat(result).isEqualTo(8.0);
    }
}