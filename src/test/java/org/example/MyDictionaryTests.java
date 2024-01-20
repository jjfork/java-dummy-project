package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Enumeration;
import java.util.Hashtable;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MyDictionaryTests {

    @Mock
    private Hashtable<String, Integer> mockHashtable;

    @InjectMocks
    private MyDictionary<String, Integer> myDictionary;

    @Test
    public void testElements() {
        Enumeration<Integer> elements = new Hashtable<Integer, Integer>().elements();
        when(mockHashtable.elements()).thenReturn(elements);
        assertThat(myDictionary.elements()).isEqualTo(elements);
    }

    @Test
    public void testGet() {
        String key = "key";
        Integer value = 10;
        when(mockHashtable.get(key)).thenReturn(value);
        assertThat(myDictionary.get(key)).isEqualTo(value);
    }

    @Test
    public void testIsEmpty() {
        when(mockHashtable.isEmpty()).thenReturn(true);
        assertThat(myDictionary.isEmpty()).isTrue();
    }

    @Test
    public void testKeys() {
        Enumeration<String> keys = new Hashtable<String, Integer>().keys();
        when(mockHashtable.keys()).thenReturn(keys);
        assertThat(myDictionary.keys()).isEqualTo(keys);
    }

    @Test
    public void testPut() {
        String key = "key";
        Integer value = 10;
        when(mockHashtable.put(key, value)).thenReturn(value);
        assertThat(myDictionary.put(key, value)).isEqualTo(value);
    }

    @Test
    public void testRemove() {
        String key = "key";
        Integer value = 10;
        when(mockHashtable.remove(key)).thenReturn(value);
        assertThat(myDictionary.remove(key)).isEqualTo(value);
    }

    @Test
    public void testSize() {
        when(mockHashtable.size()).thenReturn(5);
        assertThat(myDictionary.size()).isEqualTo(5);
    }
}