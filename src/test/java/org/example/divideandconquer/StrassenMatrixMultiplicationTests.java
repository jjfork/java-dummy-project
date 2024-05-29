package org.example.divideandconquer;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class StrassenMatrixMultiplicationTests {

    @Test
    public void testMultiply() {
        // Arrange
        StrassenMatrixMultiplication strassenMatrixMultiplication = new StrassenMatrixMultiplication();
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] expected = {{19, 22}, {43, 50}};

        // Act
        int[][] result = strassenMatrixMultiplication.multiply(A, B);

        // Assert
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSub() {
        // Arrange
        StrassenMatrixMultiplication strassenMatrixMultiplication = new StrassenMatrixMultiplication();
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] expected = {{-4, -4}, {-4, -4}};

        // Act
        int[][] result = strassenMatrixMultiplication.sub(A, B);

        // Assert
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testAdd() {
        // Arrange
        StrassenMatrixMultiplication strassenMatrixMultiplication = new StrassenMatrixMultiplication();
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] expected = {{6, 8}, {10, 12}};

        // Act
        int[][] result = strassenMatrixMultiplication.add(A, B);

        // Assert
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSplit() {
        // Arrange
        StrassenMatrixMultiplication strassenMatrixMultiplication = new StrassenMatrixMultiplication();
        int[][] P = {{1, 2}, {3, 4}};
        int[][] C = new int[2][2];
        int iB = 0;
        int jB = 0;
        int[][] expected = {{1, 2}, {3, 4}};

        // Act
        strassenMatrixMultiplication.split(P, C, iB, jB);

        // Assert
        assertThat(C).isEqualTo(expected);
    }

    @Test
    public void testJoin() {
        // Arrange
        StrassenMatrixMultiplication strassenMatrixMultiplication = new StrassenMatrixMultiplication();
        int[][] C = {{1, 2}, {3, 4}};
        int[][] P = new int[2][2];
        int iB = 0;
        int jB = 0;
        int[][] expected = {{1, 2}, {3, 4}};

        // Act
        strassenMatrixMultiplication.join(C, P, iB, jB);

        // Assert
        assertThat(P).isEqualTo(expected);
    }
}
