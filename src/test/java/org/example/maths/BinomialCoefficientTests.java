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
public class BinomialCoefficientTests {

    @Test
    public void testBinomialCoefficient_CalculateCoefficient_ReturnsCorrectValue() {
        // Arrange
        int totalObjects = 5;
        int numberOfObjects = 2;

        // Act
        int result = BinomialCoefficient.binomialCoefficient(totalObjects, numberOfObjects);

        // Assert
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void testBinomialCoefficient_NumberOfObjectsGreaterThanTotalObjects_ReturnsZero() {
        // Arrange
        int totalObjects = 3;
        int numberOfObjects = 5;

        // Act
        int result = BinomialCoefficient.binomialCoefficient(totalObjects, numberOfObjects);

        // Assert
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testBinomialCoefficient_NumberOfObjectsZero_ReturnsOne() {
        // Arrange
        int totalObjects = 4;
        int numberOfObjects = 0;

        // Act
        int result = BinomialCoefficient.binomialCoefficient(totalObjects, numberOfObjects);

        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testBinomialCoefficient_NumberOfObjectsEqualsTotalObjects_ReturnsOne() {
        // Arrange
        int totalObjects = 6;
        int numberOfObjects = 6;

        // Act
        int result = BinomialCoefficient.binomialCoefficient(totalObjects, numberOfObjects);

        // Assert
        assertThat(result).isEqualTo(1);
    }
}
