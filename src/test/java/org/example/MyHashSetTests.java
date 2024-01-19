package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class MyHashSetTests {

    @Test
    public void testAdd() {
        HashSet<String> set = new HashSet<>();
        boolean result = set.add("element");
        assertThat(result).isTrue();
    }

    @Test
    public void testClear() {
        HashSet<String> set = new HashSet<>(Arrays.asList("element1", "element2"));
        set.clear();
        assertThat(set.isEmpty()).isTrue();
    }

    @Test
    public void testContains() {
        HashSet<String> set = new HashSet<>(Arrays.asList("element1", "element2"));
        boolean result = set.contains("element1");
        assertThat(result).isTrue();
    }

    @Test
    public void testIsEmpty() {
        HashSet<String> set = new HashSet<>();
        assertThat(set.isEmpty()).isTrue();
    }

    @Test
    public void testIterator() {
        HashSet<String> set = new HashSet<>(Arrays.asList("element1", "element2"));
        assertThat(set.iterator()).isNotNull();
    }

    @Test
    public void testRemove() {
        HashSet<String> set = new HashSet<>(Arrays.asList("element1", "element2"));
        boolean result = set.remove("element1");
        assertThat(result).isTrue();
    }

    @Test
    public void testSize() {
        HashSet<String> set = new HashSet<>(Arrays.asList("element1", "element2"));
        assertThat(set.size()).isEqualTo(2);
    }
}