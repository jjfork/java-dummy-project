package org.example.datastructures.hashmap.hashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class IntersectionTests {

    @Test
    public void testIntersection_WhenArraysHaveIntersection_ThenReturnIntersectionList() {
        // Arrange
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};
        List<Integer> expected = List.of(2, 2, 3);

        // Act
        List<Integer> result = Intersection.intersection(arr1, arr2);

        // Assert
        assertThat(result).containsExactlyElementsOf(expected);
    }

    @Test
    public void testIntersection_WhenArraysHaveNoIntersection_ThenReturnEmptyList() {
        // Arrange
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        List<Integer> expected = List.of();

        // Act
        List<Integer> result = Intersection.intersection(arr1, arr2);

        // Assert
        assertThat(result).isEmpty();
    }

    @Test
    public void testIntersection_WhenOneArrayIsNull_ThenReturnEmptyList() {
        // Arrange
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = null;
        List<Integer> expected = List.of();

        // Act
        List<Integer> result = Intersection.intersection(arr1, arr2);

        // Assert
        assertThat(result).isEmpty();
    }

    @Test
    public void testIntersection_WhenBothArraysAreEmpty_ThenReturnEmptyList() {
        // Arrange
        int[] arr1 = {};
        int[] arr2 = {};
        List<Integer> expected = List.of();

        // Act
        List<Integer> result = Intersection.intersection(arr1, arr2);

        // Assert
        assertThat(result).isEmpty();
    }
}