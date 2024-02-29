package org.example.datastructures.hashmap.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GenericHashMapUsingArrayTests {

    private GenericHashMapUsingArray<String, Integer> hashMap;

    @BeforeEach
    public void setUp() {
        hashMap = new GenericHashMapUsingArray<>();
    }

    @Test
    public void testPut() {
        hashMap.put("key1", 1);
        assertThat(hashMap.size()).isEqualTo(1);
    }

    @Test
    public void testGet() {
        hashMap.put("key1", 1);
        assertThat(hashMap.get("key1")).isEqualTo(1);
    }

    @Test
    public void testRemove() {
        hashMap.put("key1", 1);
        hashMap.remove("key1");
        assertThat(hashMap.size()).isZero();
    }

    @Test
    public void testContainsKey() {
        hashMap.put("key1", 1);
        assertThat(hashMap.containsKey("key1")).isTrue();
    }
}