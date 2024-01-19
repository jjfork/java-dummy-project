package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MyHashSetTests {

    private MyHashSet<String> myHashSet;

    @Mock
    private HashSet<String> mockHashSet;

    @BeforeEach
    public void setUp() {
        myHashSet = new MyHashSet<>();
    }

    @Test
    public void testAdd() {
        assertThat(myHashSet.add("element")).isTrue();
    }

    @Test
    public void testClear() {
        myHashSet.add("element");
        myHashSet.clear();
        assertThat(myHashSet.isEmpty()).isTrue();
    }

    @Test
    public void testContains() {
        myHashSet.add("element");
        assertThat(myHashSet.contains("element")).isTrue();
    }

    @Test
    public void testIsEmpty() {
        assertThat(myHashSet.isEmpty()).isTrue();
    }

    @Test
    public void testIterator() {
        myHashSet.add("element");
        assertThat(myHashSet.iterator().next()).isEqualTo("element");
    }

    @Test
    public void testRemove() {
        myHashSet.add("element");
        assertThat(myHashSet.remove("element")).isTrue();
    }

    @Test
    public void testSize() {
        myHashSet.add("element");
        assertThat(myHashSet.size()).isEqualTo(1);
    }

    @Test
    public void testConstructorWithCollection() {
        myHashSet = new MyHashSet<>(Arrays.asList("element1", "element2"));
        assertThat(myHashSet.size()).isEqualTo(2);
    }

    @Test
    public void testConstructorWithInitialCapacity() {
        myHashSet = new MyHashSet<>(10);
        assertThat(myHashSet.size()).isEqualTo(0);
    }

    @Test
    public void testConstructorWithInitialCapacityAndLoadFactor() {
        myHashSet = new MyHashSet<>(10, 0.75f);
        assertThat(myHashSet.size()).isEqualTo(0);
    }
}