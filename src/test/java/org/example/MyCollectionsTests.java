package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MyCollectionsTests {

    @Test
    public void testAddAll() {
        List<String> list = new ArrayList<>();
        MyCollections.addAll(list, "item1", "item2", "item3");
        assert(list.size() == 3);
    }

    @Test
    public void testSort() {
        List<String> list = new ArrayList<>(Arrays.asList("c", "a", "b"));
        MyCollections.sort(list);
        assert(list.get(0).equals("a"));
        assert(list.get(1).equals("b"));
        assert(list.get(2).equals("c"));
    }

    @Test
    public void testBinarySearch() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        int result = MyCollections.binarySearch(list, "b");
        assert(result == 1);
    }

    @Test
    public void testCopy() {
        List<String> dest = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> src = new ArrayList<>(Arrays.asList("x", "y", "z"));
        MyCollections.copy(dest, src);
        assert(dest.get(0).equals("x"));
        assert(dest.get(1).equals("y"));
        assert(dest.get(2).equals("z"));
    }

    @Test
    public void testDisjoint() {
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> list2 = new ArrayList<>(Arrays.asList("x", "y", "z"));
        boolean result = MyCollections.disjoint(list1, list2);
        assert(result);
    }
}