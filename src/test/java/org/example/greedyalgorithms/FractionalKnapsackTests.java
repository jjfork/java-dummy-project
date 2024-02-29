package org.example.greedyalgorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FractionalKnapsackTests {

    @Test
    public void testFractionalKnapsack() {
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        int capacity = 50;

        int result = FractionalKnapsack.fractionalKnapsack(weight, value, capacity);

        // Add assertions here
    }
}