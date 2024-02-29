package org.example.datastructures.lists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MergeSortedArrayListTests {

    @Test
    public void testMerge() {
        // Arrange
        List<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(3);
        listA.add(5);

        List<Integer> listB = new ArrayList<>();
        listB.add(2);
        listB.add(4);
        listB.add(6);

        List<Integer> listC = new ArrayList<>();

        // Act
        MergeSortedArrayList.merge(listA, listB, listC);

        // Assert
        assertThat(listC).containsExactly(1, 2, 3, 4, 5, 6);
    }
}