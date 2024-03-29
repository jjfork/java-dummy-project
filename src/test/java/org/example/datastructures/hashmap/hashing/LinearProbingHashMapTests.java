package org.example.datastructures.hashmap.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LinearProbingHashMapTests {

    private LinearProbingHashMap<String, Integer> hashMap;

    @BeforeEach
    public void setUp() {
        hashMap = new LinearProbingHashMap<>();
    }

    @Test
    public void givenKeyAndValue_whenPut_thenValueIsAdded() {
        // Given
        String key = "test";
        Integer value = 123;

        // When
        hashMap.put(key, value);

        // Then
        assertThat(hashMap.get(key)).isEqualTo(value);
    }

    @Test
    public void givenKeyAndValue_whenDelete_thenValueIsRemoved() {
        // Given
        String key = "test";
        Integer value = 123;
        hashMap.put(key, value);

        // When
        hashMap.delete(key);

        // Then
        assertThat(hashMap.contains(key)).isFalse();
    }

    @Test
    public void givenKeyAndValue_whenGet_thenReturnsCorrectValue() {
        // Given
        String key = "test";
        Integer value = 123;
        hashMap.put(key, value);

        // When
        Integer retrievedValue = hashMap.get(key);

        // Then
        assertThat(retrievedValue).isEqualTo(value);
    }

    @Test
    public void givenKey_whenContains_thenReturnsTrue() {
        // Given
        String key = "test";
        Integer value = 123;
        hashMap.put(key, value);

        // Then
        assertThat(hashMap.contains(key)).isTrue();
    }

    @Test
    public void givenEmptyHashMap_whenSize_thenReturnsZero() {
        // Then
        assertThat(hashMap.size()).isZero();
    }

    @Test
    public void givenHashMapWithKeys_whenKeys_thenReturnsAllKeys() {
        // Given
        String key1 = "test1";
        String key2 = "test2";
        Integer value1 = 123;
        Integer value2 = 456;
        hashMap.put(key1, value1);
        hashMap.put(key2, value2);

        // Then
        assertThat(hashMap.keys()).containsExactly(key1, key2);
    }
}