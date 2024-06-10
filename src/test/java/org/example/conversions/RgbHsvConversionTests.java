package org.example.conversions;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class RgbHsvConversionTests {

    @Test
    public void testHsvToRgb() {
        // Given
        double hue = 120;
        double saturation = 0.5;
        double value = 0.8;

        // When
        int[] rgb = RgbHsvConversion.hsvToRgb(hue, saturation, value);

        // Then
        assertThat(rgb).isNotNull();
        assertThat(rgb).hasSize(3);
        // Add more assertions based on the expected output
    }

    @Test
    public void testRgbToHsv() {
        // Given
        int red = 100;
        int green = 150;
        int blue = 200;

        // When
        double[] hsv = RgbHsvConversion.rgbToHsv(red, green, blue);

        // Then
        assertThat(hsv).isNotNull();
        assertThat(hsv).hasSize(3);
        // Add more assertions based on the expected output
    }

    // Add more test cases as needed
}
