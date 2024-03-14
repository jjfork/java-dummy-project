package org.example.maths;

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
        double result = Volume.volumeSphere(5.0);
        assertThat(result).isEqualTo(523.5987755982989);
    }

    @Test
    public void testVolumeCylinder() {
        double result = Volume.volumeCylinder(3.0, 4.0);
        assertThat(result).isEqualTo(113.09733552923255);
    }

    @Test
    public void testVolumeHemisphere() {
        double result = Volume.volumeHemisphere(6.0);
        assertThat(result).isEqualTo(452.3893421169302);
    }

    @Test
    public void testVolumeCone() {
        double result = Volume.volumeCone(4.0, 5.0);
        assertThat(result).isEqualTo(83.77580409572782);
    }

    @Test
    public void testVolumePrism() {
        double result = Volume.volumePrism(10.0, 6.0);
        assertThat(result).isEqualTo(60.0);
    }

    @Test
    public void testVolumePyramid() {
        double result = Volume.volumePyramid(8.0, 4.0);
        assertThat(result).isEqualTo(10.666666666666666);
    }
}