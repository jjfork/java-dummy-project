package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyHashMapTests {

    private MyHashMap<String, Integer> myHashMap;

    @Mock
    private LinkedList<MyHashMap.Node<String, Integer>>[] table;

    @BeforeEach
    public void setUp() {
        myHashMap = new MyHashMap<>(16, 0.75f);
    }

    @Test
    public void put_ShouldAddKeyValuePairToHashMap() {
        myHashMap.put("key1", 1);
        assertThat(myHashMap.get("key1")).isEqualTo(1);
    }

    @Test
    public void get_ShouldReturnNullForNonExistentKey() {
        assertThat(myHashMap.get("nonExistentKey")).isNull();
    }

    @Test
    public void remove_ShouldRemoveKeyValuePairFromHashMap() {
        myHashMap.put("key2", 2);
        myHashMap.remove("key2");
        assertThat(myHashMap.get("key2")).isNull();
    }

    @Test
    public void resize_ShouldDoubleCapacityAndRehashElements() {
        MyHashMap.Node<String, Integer> node1 = new MyHashMap.Node<>("key1", 1);
        MyHashMap.Node<String, Integer> node2 = new MyHashMap.Node<>("key2", 2);
        MyHashMap.Node<String, Integer> node3 = new MyHashMap.Node<>("key3", 3);

        when(table.length).thenReturn(16);
        when(table[0]).thenReturn(new LinkedList<>());
        when(table[1]).thenReturn(new LinkedList<>());
        when(table[2]).thenReturn(new LinkedList<>());
        when(table[3]).thenReturn(new LinkedList<>());

        myHashMap.put("key1", 1);
        myHashMap.put("key2", 2);
        myHashMap.put("key3", 3);

        myHashMap.resize();

        assertThat(myHashMap.get("key1")).isEqualTo(1);
        assertThat(myHashMap.get("key2")).isEqualTo(2);
        assertThat(myHashMap.get("key3")).isEqualTo(3);
    }
}