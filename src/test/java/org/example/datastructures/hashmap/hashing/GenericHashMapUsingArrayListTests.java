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
public class GenericHashMapUsingArrayListTests {

    @Test
    public void testPut() {
        GenericHashMapUsingArrayList<String, Integer> hashMap = new GenericHashMapUsingArrayList<>();
        hashMap.put("key1", 1);
        assertThat(hashMap.size()).isEqualTo(1);
    }

    @Test
    public void testGet() {
        GenericHashMapUsingArrayList<String, Integer> hashMap = new GenericHashMapUsingArrayList<>();
        hashMap.put("key1", 1);
        assertThat(hashMap.get("key1")).isEqualTo(1);
    }

    @Test
    public void testRemove() {
        GenericHashMapUsingArrayList<String, Integer> hashMap = new GenericHashMapUsingArrayList<>();
        hashMap.put("key1", 1);
        hashMap.remove("key1");
        assertThat(hashMap.size()).isZero();
    }

    @Test
    public void testContainsKey() {
        GenericHashMapUsingArrayList<String, Integer> hashMap = new GenericHashMapUsingArrayList<>();
        hashMap.put("key1", 1);
        assertThat(hashMap.containsKey("key1")).isTrue();
        assertThat(hashMap.containsKey("key2")).isFalse();
    }

    @Test
    public void testToString() {
        GenericHashMapUsingArrayList<String, Integer> hashMap = new GenericHashMapUsingArrayList<>();
        hashMap.put("key1", 1);
        assertThat(hashMap.toString()).contains("key1 : 1");
    }
}
