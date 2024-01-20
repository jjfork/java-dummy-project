package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class MyHashSetTests {

    @Test
    public void testAdd() {
        MyHashSet<String> set = new MyHashSet<>();
        boolean result = set.add("element");
        assertThat(result).isTrue();
    }

    @Test
    public void testClear() {
        MyHashSet<String> set = new MyHashSet<>();
        set.add("element");
        set.clear();
        assertThat(set.isEmpty()).isTrue();
    }

    @Test
    public void testContains() {
        MyHashSet<String> set = new MyHashSet<>();
        set.add("element");
        assertThat(set.contains("element")).isTrue();
    }

    @Test
    public void testIsEmpty() {
        MyHashSet<String> set = new MyHashSet<>();
        assertThat(set.isEmpty()).isTrue();
    }

    @Test
    public void testIterator() {
        MyHashSet<String> set = new MyHashSet<>();
        set.add("element1");
        set.add("element2");
        assertThat(set.size()).isEqualTo(2);
    }

    @Test
    public void testRemove() {
        MyHashSet<String> set = new MyHashSet<>();
        set.add("element");
        boolean result = set.remove("element");
        assertThat(result).isTrue();
    }

    @Test
    public void testSize() {
        MyHashSet<String> set = new MyHashSet<>();
        set.add("element1");
        set.add("element2");
        assertThat(set.size()).isEqualTo(2);
    }
}