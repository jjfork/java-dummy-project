package org.example.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MatrixRankTests {

    @Test
    public void testComputeRank_WhenMatrixIsNull_ThrowsIllegalArgumentException() {
        assertThatThrownBy(() -> MatrixRank.computeRank(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The input matrix cannot be null");
    }

    @Test
    public void testComputeRank_WhenMatrixIsEmpty_ThrowsIllegalArgumentException() {
        assertThatThrownBy(() -> MatrixRank.computeRank(new double[0][]))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The input matrix cannot be empty");
    }

    @Test
    public void testComputeRank_WhenMatrixHasNullRows_ThrowsIllegalArgumentException() {
        assertThatThrownBy(() -> MatrixRank.computeRank(new double[][]{{1.0, 2.0}, null}))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The input matrix cannot have null or empty rows");
    }

    @Test
    public void testComputeRank_WhenMatrixIsJagged_ThrowsIllegalArgumentException() {
        assertThatThrownBy(() -> MatrixRank.computeRank(new double[][]{{1.0, 2.0}, {3.0}}))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The input matrix cannot be jagged");
    }

    // Add more test cases for the computeRank method as needed

}
