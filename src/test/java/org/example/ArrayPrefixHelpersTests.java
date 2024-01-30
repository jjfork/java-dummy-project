package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import java.util.function.IntBinaryOperator;

@ExtendWith(MockitoExtension.class)
public class ArrayPrefixHelpersTests {

    @Test
    public void testParallelPrefixIntArray() {
        // Arrange
        int[] array = {1, 2, 3, 4, 5};
        IntBinaryOperator operator = (x, y) -> x + y;

        // Act
        ArrayPrefixHelpers.parallelPrefixIntArray(array, operator);

        // Assert
        // Add assertions here
    }

    @Test
    public void testParallelPrefixIntArrayRange() {
        // Arrange
        int[] array = {1, 2, 3, 4, 5};
        int fromIndex = 1;
        int toIndex = 3;
        IntBinaryOperator operator = (x, y) -> x + y;

        // Act
        ArrayPrefixHelpers.parallelPrefixIntArrayRange(array, fromIndex, toIndex, operator);

        // Assert
        // Add assertions here
    }

    @Test
    public void testFillPrefixSum() {
        // Arrange
        int[] array = {1, 2, 3, 4, 5};
        int[] prefixSum = new int[array.length];

        // Act
        ArrayPrefixHelpers.fillPrefixSum(array, prefixSum);

        // Assert
        // Add assertions here
    }

    @Test
    public void testFillPrefixSumSubarray() {
        // Arrange
        int[] array = {1, 2, 3, 4, 5};
        int start = 1;
        int end = 3;
        int[] prefixSum = new int[array.length];

        // Act
        ArrayPrefixHelpers.fillPrefixSumSubarray(array, start, end, prefixSum);

        // Assert
        // Add assertions here
    }
}