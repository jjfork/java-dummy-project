package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyCollectionTests {

    @Test
    public void testSize() {
        MyCollection<String> collection = new MyCollection<>();
        collection.add("element1");
        collection.add("element2");
        assertThat(collection.size()).isEqualTo(2);
    }

    @Test
    public void testIsEmpty() {
        MyCollection<String> collection = new MyCollection<>();
        assertThat(collection.isEmpty()).isTrue();
        collection.add("element");
        assertThat(collection.isEmpty()).isFalse();
    }

    @Test
    public void testContains() {
        MyCollection<String> collection = new MyCollection<>();
        collection.add("element");
        assertThat(collection.contains("element")).isTrue();
    }

    @Test
    public void testIterator() {
        MyCollection<String> collection = new MyCollection<>();
        collection.add("element1");
        collection.add("element2");
        Iterator<String> iterator = collection.iterator();
        assertThat(iterator.next()).isEqualTo("element1");
        assertThat(iterator.next()).isEqualTo("element2");
    }

    @Test
    public void testToArray() {
        MyCollection<String> collection = new MyCollection<>();
        collection.add("element1");
        collection.add("element2");
        Object[] array = collection.toArray();
        assertThat(array).contains("element1", "element2");
    }

    @Test
    public void testAdd() {
        MyCollection<String> collection = new MyCollection<>();
        assertThat(collection.add("element")).isTrue();
    }

    @Test
    public void testRemove() {
        MyCollection<String> collection = new MyCollection<>();
        collection.add("element");
        assertThat(collection.remove("element")).isTrue();
    }
}