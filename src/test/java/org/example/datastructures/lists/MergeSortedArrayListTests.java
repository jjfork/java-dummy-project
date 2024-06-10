package org.example.datastructures.lists;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeSortedArrayListTests {

    @Test
    public void testMerge() {
        List<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(3);
        listA.add(5);

        List<Integer> listB = new ArrayList<>();
        listB.add(2);
        listB.add(4);
        listB.add(6);

        List<Integer> listC = new ArrayList<>();

        MergeSortedArrayList.merge(listA, listB, listC);

        assertThat(listC).containsExactly(1, 2, 3, 4, 5, 6);
    }

    @Test
    public void testMergeWithEmptyLists() {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();

        MergeSortedArrayList.merge(listA, listB, listC);

        assertThat(listC).isEmpty();
    }

    @Test
    public void testMergeWithOneEmptyList() {
        List<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(3);
        listA.add(5);

        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();

        MergeSortedArrayList.merge(listA, listB, listC);

        assertThat(listC).containsExactly(1, 3, 5);
    }
}