package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.function.IntBinaryOperator;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ArrayPrefixHelpersTests {

    @Test
    void testParallelPrefixIntArray() {
        int[] array = {1, 2, 3, 4, 5};
        IntBinaryOperator operator = (x, y) -> x + y;
        ArrayPrefixHelpers.parallelPrefixIntArray(array, operator);
        // Add assertions here
    }

    @Test
    void testParallelPrefixIntArrayRange() {
        int[] array = {1, 2, 3, 4, 5};
        IntBinaryOperator operator = (x, y) -> x + y;
        ArrayPrefixHelpers.parallelPrefixIntArrayRange(array, 1, 4, operator);
        // Add assertions here
    }

    @Test
    void testFillPrefixSum() {
        int[] array = {1, 2, 3, 4, 5};
        int[] prefixSum = new int[array.length];
        ArrayPrefixHelpers.fillPrefixSum(array, prefixSum);
        // Add assertions here
    }

    @Test
    void testFillPrefixSumSubarray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] prefixSum = new int[array.length];
        ArrayPrefixHelpers.fillPrefixSumSubarray(array, 1, 3, prefixSum);
        // Add assertions here
    }
}