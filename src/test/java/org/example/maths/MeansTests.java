package org.example.maths;

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

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@ExtendWith(MockitoExtension.class)
public class MeansTests {

    @Test
    public void testArithmeticMean() {
        Iterable<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        Double expectedMean = 3.0;

        Double actualMean = Means.arithmetic(numbers);

        assertThat(actualMean).isEqualTo(expectedMean);
    }

    @Test
    public void testGeometricMean() {
        Iterable<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        Double expectedMean = 2.605171084697352;

        Double actualMean = Means.geometric(numbers);

        assertThat(actualMean).isEqualTo(expectedMean);
    }

    @Test
    public void testHarmonicMean() {
        Iterable<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        Double expectedMean = 2.18978102189781;

        Double actualMean = Means.harmonic(numbers);

        assertThat(actualMean).isEqualTo(expectedMean);
    }

    @Test
    public void testEmptyListForArithmeticMean() {
        Iterable<Double> numbers = Arrays.asList();

        assertThatThrownBy(() -> Means.arithmetic(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Emtpy list given for Mean computation.");
    }

    @Test
    public void testEmptyListForGeometricMean() {
        Iterable<Double> numbers = Arrays.asList();

        assertThatThrownBy(() -> Means.geometric(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Emtpy list given for Mean computation.");
    }

    @Test
    public void testEmptyListForHarmonicMean() {
        Iterable<Double> numbers = Arrays.asList();

        assertThatThrownBy(() -> Means.harmonic(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Emtpy list given for Mean computation.");
    }
}
