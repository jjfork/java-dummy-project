package org.example.divideandconquer;

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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StrassenMatrixMultiplicationTests {

    @Test
    public void testMultiply() {
        StrassenMatrixMultiplication strassenMatrixMultiplication = new StrassenMatrixMultiplication();
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] expected = {{19, 22}, {43, 50}};
        int[][] result = strassenMatrixMultiplication.multiply(A, B);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSub() {
        StrassenMatrixMultiplication strassenMatrixMultiplication = new StrassenMatrixMultiplication();
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] expected = {{-4, -4}, {-4, -4}};
        int[][] result = strassenMatrixMultiplication.sub(A, B);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testAdd() {
        StrassenMatrixMultiplication strassenMatrixMultiplication = new StrassenMatrixMultiplication();
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] expected = {{6, 8}, {10, 12}};
        int[][] result = strassenMatrixMultiplication.add(A, B);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSplit() {
        StrassenMatrixMultiplication strassenMatrixMultiplication = new StrassenMatrixMultiplication();
        int[][] P = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] C = new int[2][2];
        int[][] expected = {{1, 2}, {4, 5}};
        strassenMatrixMultiplication.split(P, C, 0, 0);
        assertThat(C).isEqualTo(expected);
    }

    @Test
    public void testJoin() {
        StrassenMatrixMultiplication strassenMatrixMultiplication = new StrassenMatrixMultiplication();
        int[][] C = {{1, 2}, {3, 4}};
        int[][] P = new int[3][3];
        int[][] expected = {{1, 2, 0}, {3, 4, 0}, {0, 0, 0}};
        strassenMatrixMultiplication.join(C, P, 0, 0);
        assertThat(P).isEqualTo(expected);
    }
}