package org.example.maths;

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

import java.math.BigDecimal;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MatrixUtilTests {

    @Test
    void testAdd() {
        BigDecimal[][] matrix1 = {
            {new BigDecimal(3), new BigDecimal(2)},
            {new BigDecimal(0), new BigDecimal(1)},
        };

        BigDecimal[][] matrix2 = {
            {new BigDecimal(1), new BigDecimal(3)},
            {new BigDecimal(2), new BigDecimal(0)},
        };

        MatrixUtil matrixUtil = new MatrixUtil();

        Optional<BigDecimal[][]> result = matrixUtil.add(matrix1, matrix2);

        assertThat(result).isPresent();
        BigDecimal[][] actual = result.get();
        BigDecimal[][] expected = {
            {new BigDecimal(4), new BigDecimal(5)},
            {new BigDecimal(2), new BigDecimal(1)},
        };
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSubtract() {
        BigDecimal[][] matrix1 = {
            {new BigDecimal(1), new BigDecimal(4)},
            {new BigDecimal(5), new BigDecimal(6)},
        };

        BigDecimal[][] matrix2 = {
            {new BigDecimal(2), new BigDecimal(0)},
            {new BigDecimal(-2), new BigDecimal(-3)},
        };

        MatrixUtil matrixUtil = new MatrixUtil();

        Optional<BigDecimal[][]> result = matrixUtil.subtract(matrix1, matrix2);

        assertThat(result).isPresent();
        BigDecimal[][] actual = result.get();
        BigDecimal[][] expected = {
            {new BigDecimal(-1), new BigDecimal(4)},
            {new BigDecimal(7), new BigDecimal(9)},
        };
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testMultiply() {
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

        MatrixUtil matrixUtil = new MatrixUtil();

        Optional<BigDecimal[][]> result = matrixUtil.multiply(matrix1, matrix2);

        assertThat(result).isPresent();
        BigDecimal[][] actual = result.get();
        BigDecimal[][] expected = {
            {new BigDecimal(22), new BigDecimal(28)},
            {new BigDecimal(49), new BigDecimal(64)},
            {new BigDecimal(76), new BigDecimal(100)},
        };
        assertThat(actual).isEqualTo(expected);
    }
}