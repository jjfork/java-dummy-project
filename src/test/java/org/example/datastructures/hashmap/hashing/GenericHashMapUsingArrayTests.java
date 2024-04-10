package org.example.datastructures.hashmap.hashing;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

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
        assertThat(hashMap.containsKey("key2")).isFalse();
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
