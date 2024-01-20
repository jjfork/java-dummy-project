package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MyCollectionsTests {

    MyCollections myCollections;
    List<String> testList;

    @BeforeEach
    public void setUp() {
        myCollections = new MyCollections();
        testList = new ArrayList<>();
        myCollections.addAll(testList, "apple", "banana", "cherry");
    }

    @Test
    public void testAddAll() {
        myCollections.addAll(testList, "date", "fig");
        assertThat(testList).contains("apple", "banana", "cherry", "date", "fig");
    }

    @Test
    public void testSort() {
        myCollections.sort(testList);
        assertThat(testList).containsExactly("apple", "banana", "cherry");
    }

    @Test
    public void testBinarySearch() {
        int index = myCollections.binarySearch(testList, "banana");
        assertThat(index).isEqualTo(1);
    }

    @Test
    public void testCopy() {
        List<String> destList = new ArrayList<>();
        myCollections.copy(destList, testList);
        assertThat(destList).containsExactly("apple", "banana", "cherry");
    }

    @Test
    public void testDisjoint() {
        List<String> testList2 = new ArrayList<>();
        myCollections.addAll(testList2, "date", "fig");
        boolean result = myCollections.disjoint(testList, testList2);
        assertThat(result).isTrue();
    }
}