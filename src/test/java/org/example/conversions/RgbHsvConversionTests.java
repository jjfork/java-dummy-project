package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class RgbHsvConversionTests {

    @Test
    public void testHsvToRgb() {
        // Arrange
        double hue = 120;
        double saturation = 0.5;
        double value = 0.8;

        // Act
        int[] result = RgbHsvConversion.hsvToRgb(hue, saturation, value);

        // Assert
        assertThat(result).isNotNull();
        // Add more assertions based on the expected output
    }

    @Test
    public void testRgbToHsv() {
        // Arrange
        int red = 100;
        int green = 150;
        int blue = 200;

        // Act
        double[] result = RgbHsvConversion.rgbToHsv(red, green, blue);

        // Assert
        assertThat(result).isNotNull();
        // Add more assertions based on the expected output
    }
}