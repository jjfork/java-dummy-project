package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MatrixRankTests {

    @Test
    public void testComputeRank_WhenMatrixIsNull_ThrowsIllegalArgumentException() {
        // Arrange
        double[][] matrix = null;

        // Act and Assert
        assertThatThrownBy(() -> MatrixRank.computeRank(matrix))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The input matrix cannot be null");
    }

    @Test
    public void testComputeRank_WhenMatrixIsEmpty_ThrowsIllegalArgumentException() {
        // Arrange
        double[][] matrix = {};

        // Act and Assert
        assertThatThrownBy(() -> MatrixRank.computeRank(matrix))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The input matrix cannot be empty");
    }

    @Test
    public void testComputeRank_WhenMatrixHasNullRows_ThrowsIllegalArgumentException() {
        // Arrange
        double[][] matrix = {{1.0, 2.0}, null, {3.0, 4.0}};

        // Act and Assert
        assertThatThrownBy(() -> MatrixRank.computeRank(matrix))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The input matrix cannot have null or empty rows");
    }

    @Test
    public void testComputeRank_WhenMatrixIsJagged_ThrowsIllegalArgumentException() {
        // Arrange
        double[][] matrix = {{1.0, 2.0, 3.0}, {4.0, 5.0}};

        // Act and Assert
        assertThatThrownBy(() -> MatrixRank.computeRank(matrix))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The input matrix cannot be jagged");
    }

    // Add more tests for the computeRank method as needed
}