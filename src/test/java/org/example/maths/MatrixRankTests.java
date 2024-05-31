package org.example.maths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixRankTests {

    @Test
    void testComputeRank() {
        double[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int expectedRank = 2;
        int actualRank = MatrixRank.computeRank(matrix);
        assertEquals(expectedRank, actualRank);
    }

    @Test
    void testComputeRankWithZeroMatrix() {
        double[][] matrix = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int expectedRank = 0;
        int actualRank = MatrixRank.computeRank(matrix);
        assertEquals(expectedRank, actualRank);
    }

    @Test
    void testComputeRankWithIdentityMatrix() {
        double[][] matrix = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        int expectedRank = 3;
        int actualRank = MatrixRank.computeRank(matrix);
        assertEquals(expectedRank, actualRank);
    }

    @Test
    void testComputeRankWithEmptyMatrix() {
        double[][] matrix = {};
        try {
            MatrixRank.computeRank(matrix);
        } catch (IllegalArgumentException e) {
            assertEquals("The input matrix cannot be empty", e.getMessage());
        }
    }

    @Test
    void testComputeRankWithJaggedMatrix() {
        double[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8}
        };
        try {
            MatrixRank.computeRank(matrix);
        } catch (IllegalArgumentException e) {
            assertEquals("The input matrix cannot be jagged", e.getMessage());
        }
    }
}
