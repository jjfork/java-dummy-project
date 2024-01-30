package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MyCollectionTests {

    @Test
    public void testSize() {
        MyCollection<Integer> collection = new MyCollection<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        assertEquals(3, collection.size());
    }

    @Test
    public void testIsEmpty() {
        MyCollection<String> collection = new MyCollection<>();
        assertTrue(collection.isEmpty());
        collection.add("test");
        assertFalse(collection.isEmpty());
    }

    @Test
    public void testContains() {
        MyCollection<String> collection = new MyCollection<>();
        collection.add("test");
        assertTrue(collection.contains("test"));
        assertFalse(collection.contains("example"));
    }

    @Test
    public void testIterator() {
        MyCollection<Integer> collection = new MyCollection<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        Iterator<Integer> iterator = collection.iterator();
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(3, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testToArray() {
        MyCollection<String> collection = new MyCollection<>();
        collection.add("test1");
        collection.add("test2");
        Object[] array = collection.toArray();
        assertNotNull(array);
        assertEquals(2, array.length);
        assertEquals("test1", array[0]);
        assertEquals("test2", array[1]);
    }

    @Test
    public void testAdd() {
        MyCollection<Integer> collection = new MyCollection<>();
        assertTrue(collection.add(1));
        assertEquals(1, collection.size());
    }

    @Test
    public void testRemove() {
        MyCollection<String> collection = new MyCollection<>();
        collection.add("test");
        assertTrue(collection.remove("test"));
        assertFalse(collection.contains("test"));
    }
}