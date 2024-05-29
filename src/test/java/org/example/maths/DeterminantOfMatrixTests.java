package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

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

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class DeterminantOfMatrixTests {

    @Test
    void testDeterminant() {
        int[][] matrix = {{1, 2}, {3, 4}};
        int result = DeterminantOfMatrix.determinant(matrix, 2);
        assertEquals(-2, result);
    }

    @Test
    void testDeterminantSingleElementMatrix() {
        int[][] matrix = {{5}};
        int result = DeterminantOfMatrix.determinant(matrix, 1);
        assertEquals(5, result);
    }

    @Test
    void testDeterminant3x3Matrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result = DeterminantOfMatrix.determinant(matrix, 3);
        assertEquals(0, result);
    }

}
