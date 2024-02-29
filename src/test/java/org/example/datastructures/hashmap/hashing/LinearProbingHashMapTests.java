package org.example.datastructures.hashmap.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LinearProbingHashMapTests {

    private LinearProbingHashMap<String, Integer> hashMap;

    @BeforeEach
    public void setUp() {
        hashMap = new LinearProbingHashMap<>();
    }

    @Test
    public void testPut() {
        hashMap.put("key1", 1);
        hashMap.put("key2", 2);
        hashMap.put("key3", 3);

        // Add assertions here
    }

    @Test
    public void testGet() {
        hashMap.put("key1", 1);
        hashMap.put("key2", 2);
        hashMap.put("key3", 3);

        // Add assertions here
    }

    @Test
    public void testDelete() {
        hashMap.put("key1", 1);
        hashMap.put("key2", 2);
        hashMap.put("key3", 3);

        // Add assertions here
    }

    @Test
    public void testContains() {
        hashMap.put("key1", 1);
        hashMap.put("key2", 2);
        hashMap.put("key3", 3);

        // Add assertions here
    }

    @Test
    public void testSize() {
        hashMap.put("key1", 1);
        hashMap.put("key2", 2);
        hashMap.put("key3", 3);

        // Add assertions here
    }

    @Test
    public void testKeys() {
        hashMap.put("key1", 1);
        hashMap.put("key2", 2);
        hashMap.put("key3", 3);

        // Add assertions here
    }
}