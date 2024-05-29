package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class MeansTests {

    @Test
    public void arithmetic_WhenListNotEmpty_ReturnsCorrectValue() {
        Iterable<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        Double result = Means.arithmetic(numbers);
        assertThat(result).isEqualTo(3.0);
    }

    @Test
    public void arithmetic_WhenListEmpty_ThrowsIllegalArgumentException() {
        Iterable<Double> numbers = Arrays.asList();
        assertThrows(IllegalArgumentException.class, () -> Means.arithmetic(numbers));
    }

    @Test
    public void geometric_WhenListNotEmpty_ReturnsCorrectValue() {
        Iterable<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        Double result = Means.geometric(numbers);
        assertThat(result).isEqualTo(2.605171084697352);
    }

    @Test
    public void geometric_WhenListEmpty_ThrowsIllegalArgumentException() {
        Iterable<Double> numbers = Arrays.asList();
        assertThrows(IllegalArgumentException.class, () -> Means.geometric(numbers));
    }

    @Test
    public void harmonic_WhenListNotEmpty_ReturnsCorrectValue() {
        Iterable<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        Double result = Means.harmonic(numbers);
        assertThat(result).isEqualTo(2.18978102189781);
    }

    @Test
    public void harmonic_WhenListEmpty_ThrowsIllegalArgumentException() {
        Iterable<Double> numbers = Arrays.asList();
        assertThrows(IllegalArgumentException.class, () -> Means.harmonic(numbers));
    }
}
