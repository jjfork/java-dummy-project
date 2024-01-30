package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyHashSetTests {

    @Test
    public void testAdd() {
        MyHashSet<String> set = new MyHashSet<>();
        boolean result = set.add("test");
        assertTrue(result);
    }

    @Test
    public void testClear() {
        MyHashSet<String> set = new MyHashSet<>();
        set.add("test");
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    public void testContains() {
        MyHashSet<String> set = new MyHashSet<>();
        set.add("test");
        assertTrue(set.contains("test"));
    }

    @Test
    public void testIsEmpty() {
        MyHashSet<String> set = new MyHashSet<>();
        assertTrue(set.isEmpty());
    }

    @Test
    public void testIterator() {
        MyHashSet<String> set = new MyHashSet<>();
        set.add("test");
        java.util.Iterator<String> iterator = set.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("test", iterator.next());
    }

    @Test
    public void testRemove() {
        MyHashSet<String> set = new MyHashSet<>();
        set.add("test");
        boolean result = set.remove("test");
        assertTrue(result);
        assertFalse(set.contains("test"));
    }

    @Test
    public void testSize() {
        MyHashSet<String> set = new MyHashSet<>();
        set.add("test");
        assertEquals(1, set.size());
    }
}