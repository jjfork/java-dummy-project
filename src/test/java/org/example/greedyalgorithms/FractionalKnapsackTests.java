package org.example.greedyalgorithms;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class FractionalKnapsackTests {

    @Test
    public void testFractionalKnapsack() {
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        int capacity = 50;
        int expected = 240;
        
        int result = FractionalKnapsack.fractionalKnapsack(weight, value, capacity);
        
        assertThat(result).isEqualTo(expected);
    }
    
    @Test
    public void testFractionalKnapsackWithEmptyKnapsack() {
        int[] weight = {};
        int[] value = {};
        int capacity = 50;
        int expected = 0;
        
        int result = FractionalKnapsack.fractionalKnapsack(weight, value, capacity);
        
        assertThat(result).isEqualTo(expected);
    }
    
    @Test
    public void testFractionalKnapsackWithSingleItem() {
        int[] weight = {10};
        int[] value = {60};
        int capacity = 5;
        int expected = 30;
        
        int result = FractionalKnapsack.fractionalKnapsack(weight, value, capacity);
        
        assertThat(result).isEqualTo(expected);
    }
}
