package org.example.datastructures.hashmap.hashing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class GenericHashMapUsingArrayTests {

    @Test
    public void testPut() {
        GenericHashMapUsingArray<String, Integer> hashMap = new GenericHashMapUsingArray<>();
        hashMap.put("key1", 1);
        assertThat(hashMap.size()).isEqualTo(1);
    }

    @Test
    public void testRemove() {
        GenericHashMapUsingArray<String, Integer> hashMap = new GenericHashMapUsingArray<>();
        hashMap.put("key1", 1);
        hashMap.remove("key1");
        assertThat(hashMap.size()).isZero();
    }

    @Test
    public void testGet() {
        GenericHashMapUsingArray<String, Integer> hashMap = new GenericHashMapUsingArray<>();
        hashMap.put("key1", 1);
        assertThat(hashMap.get("key1")).isEqualTo(1);
    }

    @Test
    public void testContainsKey() {
        GenericHashMapUsingArray<String, Integer> hashMap = new GenericHashMapUsingArray<>();
        hashMap.put("key1", 1);
        assertThat(hashMap.containsKey("key1")).isTrue();
    }

    @Test
    public void testReHash() {
        GenericHashMapUsingArray<String, Integer> hashMap = new GenericHashMapUsingArray<>();
        for (int i = 0; i < 20; i++) {
            hashMap.put("key" + i, i);
        }
        assertThat(hashMap.size()).isEqualTo(20);
    }

}