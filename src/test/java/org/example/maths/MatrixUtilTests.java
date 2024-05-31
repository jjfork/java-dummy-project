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

import java.math.BigDecimal;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MatrixUtilTests {

    @Test
    public void add_ValidMatrices_ReturnsSumMatrix() {
        // Given
        BigDecimal[][] matrix1 = {
            {new BigDecimal(3), new BigDecimal(2)},
            {new BigDecimal(0), new BigDecimal(1)},
        };

        BigDecimal[][] matrix2 = {
            {new BigDecimal(1), new BigDecimal(3)},
            {new BigDecimal(2), new BigDecimal(0)},
        };

        // When
        Optional<BigDecimal[][]> result = MatrixUtil.add(matrix1, matrix2);

        // Then
        assertThat(result).isPresent();
        BigDecimal[][] sumMatrix = result.get();
        BigDecimal[][] expectedSumMatrix = {
            {new BigDecimal(4), new BigDecimal(5)},
            {new BigDecimal(2), new BigDecimal(1)},
        };
        assertThat(sumMatrix).isEqualTo(expectedSumMatrix);
    }

    @Test
    public void subtract_ValidMatrices_ReturnsDifferenceMatrix() {
        // Given
        BigDecimal[][] matrix1 = {
            {new BigDecimal(1), new BigDecimal(4)},
            {new BigDecimal(5), new BigDecimal(6)},
        };

        BigDecimal[][] matrix2 = {
            {new BigDecimal(2), new BigDecimal(0)},
            {new BigDecimal(-2), new BigDecimal(-3)},
        };

        // When
        Optional<BigDecimal[][]> result = MatrixUtil.subtract(matrix1, matrix2);

        // Then
        assertThat(result).isPresent();
        BigDecimal[][] diffMatrix = result.get();
        BigDecimal[][] expectedDiffMatrix = {
            {new BigDecimal(-1), new BigDecimal(4)},
            {new BigDecimal(7), new BigDecimal(9)},
        };
        assertThat(diffMatrix).isEqualTo(expectedDiffMatrix);
    }

    @Test
    public void multiply_ValidMatrices_ReturnsProductMatrix() {
        // Given
        BigDecimal[][] matrix1 = {
            {new BigDecimal(1), new BigDecimal(2), new BigDecimal(3)},
            {new BigDecimal(4), new BigDecimal(5), new BigDecimal(6)},
            {new BigDecimal(7), new BigDecimal(8), new BigDecimal(9)},
        };

        BigDecimal[][] matrix2 = {
            {new BigDecimal(1), new BigDecimal(2)},
            {new BigDecimal(3), new BigDecimal(4)},
            {new BigDecimal(5), new BigDecimal(6)},
        };

        // When
        Optional<BigDecimal[][]> result = MatrixUtil.multiply(matrix1, matrix2);

        // Then
        assertThat(result).isPresent();
        BigDecimal[][] productMatrix = result.get();
        BigDecimal[][] expectedProductMatrix = {
            {new BigDecimal(22), new BigDecimal(28)},
            {new BigDecimal(49), new BigDecimal(64)},
            {new BigDecimal(76), new BigDecimal(100)},
        };
        assertThat(productMatrix).isEqualTo(expectedProductMatrix);
    }

    @Test
    public void add_InvalidMatrices_ReturnsEmptyOptional() {
        // Given
        BigDecimal[][] matrix1 = {
            {new BigDecimal(1), new BigDecimal(2)},
            {new BigDecimal(3), new BigDecimal(4)},
        };

        BigDecimal[][] matrix2 = {
            {new BigDecimal(1), new BigDecimal(2), new BigDecimal(3)},
            {new BigDecimal(4), new BigDecimal(5), new BigDecimal(6)},
        };

        // When
        Optional<BigDecimal[][]> result = MatrixUtil.add(matrix1, matrix2);

        // Then
        assertThat(result).isEmpty();
    }

    @Test
    public void subtract_InvalidMatrices_ReturnsEmptyOptional() {
        // Given
        BigDecimal[][] matrix1 = {
            {new BigDecimal(1), new BigDecimal(2)},
            {new BigDecimal(3), new BigDecimal(4)},
        };

        BigDecimal[][] matrix2 = {
            {new BigDecimal(1), new BigDecimal(2), new BigDecimal(3)},
            {new BigDecimal(4), new BigDecimal(5), new BigDecimal(6)},
        };

        // When
        Optional<BigDecimal[][]> result = MatrixUtil.subtract(matrix1, matrix2);

        // Then
        assertThat(result).isEmpty();
    }

    @Test
    public void multiply_InvalidMatrices_ReturnsEmptyOptional() {
        // Given
        BigDecimal[][] matrix1 = {
            {new BigDecimal(1), new BigDecimal(2)},
            {new BigDecimal(3), new BigDecimal(4)},
        };

        BigDecimal[][] matrix2 = {
            {new BigDecimal(1), new BigDecimal(2)},
            {new BigDecimal(3), new BigDecimal(4)},
            {new BigDecimal(5), new BigDecimal(6)},
        };

       // When
        Optional<BigDecimal[][]> result = MatrixUtil.multiply(matrix1, matrix2);

        // Then
        assertThat(result).isEmpty();
    }
}
