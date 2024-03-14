package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MeansTests {

    @Test
    public void arithmetic_WhenIterableIsEmpty_ThenThrowIllegalArgumentException() {
        // Arrange
        Iterable<Double> numbers = Arrays.asList();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> Means.arithmetic(numbers));
    }

    @Test
    public void arithmetic_WhenIterableIsNotEmpty_ThenReturnArithmeticMean() {
        // Arrange
        Iterable<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);

        // Act
        Double result = Means.arithmetic(numbers);

        // Assert
        assertThat(result).isEqualTo(3.0);
    }

    @Test
    public void geometric_WhenIterableIsEmpty_ThenThrowIllegalArgumentException() {
        // Arrange
        Iterable<Double> numbers = Arrays.asList();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> Means.geometric(numbers));
    }

    @Test
    public void geometric_WhenIterableIsNotEmpty_ThenReturnGeometricMean() {
        // Arrange
        Iterable<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);

        // Act
        Double result = Means.geometric(numbers);

        // Assert
        assertThat(result).isEqualTo(2.605171084697352);
    }

    @Test
    public void harmonic_WhenIterableIsEmpty_ThenThrowIllegalArgumentException() {
        // Arrange
        Iterable<Double> numbers = Arrays.asList();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> Means.harmonic(numbers));
    }

    @Test
    public void harmonic_WhenIterableIsNotEmpty_ThenReturnHarmonicMean() {
        // Arrange
        Iterable<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);

        // Act
        Double result = Means.harmonic(numbers);

        // Assert
        assertThat(result).isEqualTo(2.18978102189781);
    }
}