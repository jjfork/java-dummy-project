package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.function.IntBinaryOperator;

@ExtendWith(MockitoExtension.class)
public class ArrayPrefixHelpersTests {

    @Test
    public void testParallelPrefixIntArray() {
        int[] array = {1, 2, 3, 4, 5};
        IntBinaryOperator operator = (x, y) -> x + y;
        Arrays.parallelPrefix(array, operator);
        assertArrayEquals(new int[]{1, 3, 6, 10, 15}, array);
    }

    @Test
    public void testParallelPrefixIntArrayRange() {
        int[] array = {1, 2, 3, 4, 5};
        IntBinaryOperator operator = (x, y) -> x + y;
        Arrays.parallelPrefix(array, 1, 4, operator);
        assertArrayEquals(new int[]{1, 3, 6, 10, 5}, array);
    }

    @Test
    public void testFillPrefixSum() {
        int[] array = {1, 2, 3, 4, 5};
        int[] prefixSum = new int[5];
        Arrays.fill(prefixSum, 0);
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i - 1];
        }
        assertArrayEquals(new int[]{1, 3, 6, 10, 15}, array);
    }

    @Test
    public void testFillPrefixSumSubarray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] prefixSum = new int[5];
        Arrays.fill(prefixSum, 0);
        for (int i = 1; i < 3; i++) {
            prefixSum[i] += array[i - 1];
        }
        assertArrayEquals(new int[]{0, 2, 0, 0, 0}, prefixSum);
    }
}