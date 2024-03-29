package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class MatrixRankTests {

    @Test
    public void testComputeRank_WhenMatrixIsNull_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MatrixRank.computeRank(null);
        });
    }

    @Test
    public void testComputeRank_WhenMatrixIsEmpty_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MatrixRank.computeRank(new double[][]{});
        });
    }

    @Test
    public void testComputeRank_WhenMatrixHasNullRows_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MatrixRank.computeRank(new double[][]{{1.0, 2.0}, null, {3.0, 4.0}});
        });
    }

    @Test
    public void testComputeRank_WhenMatrixIsJagged_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MatrixRank.computeRank(new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0}});
        });
    }
}