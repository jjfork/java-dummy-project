package org.example.datastructures.lists;

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class MergeSortedArrayListTests {

    @Test
    public void testMerge_emptyLists() {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();

        MergeSortedArrayList.merge(listA, listB, listC);

        assertThat(listC).isEmpty();
    }

    @Test
    public void testMerge_oneListEmpty() {
        List<Integer> listA = new ArrayList<>(Arrays.asList(1, 3, 5));
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();

        MergeSortedArrayList.merge(listA, listB, listC);

        assertThat(listC).containsExactly(1, 3, 5);
    }

    @Test
    public void testMerge_bothListsNonEmpty() {
        List<Integer> listA = new ArrayList<>(Arrays.asList(2, 4, 6));
        List<Integer> listB = new ArrayList<>(Arrays.asList(1, 3, 5));
        List<Integer> listC = new ArrayList<>();

        MergeSortedArrayList.merge(listA, listB, listC);

        assertThat(listC).containsExactly(1, 2, 3, 4, 5, 6);
    }
}
