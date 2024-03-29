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
    public void givenKeyAndValue_whenPut_thenSizeIncreased() {
        hashMap.put("one", 1);
        assertThat(hashMap.size()).isEqualTo(1);
    }

    @Test
    public void givenExistingKeyAndNewValue_whenPut_thenValueUpdated() {
        hashMap.put("one", 1);
        hashMap.put("one", 2);
        assertThat(hashMap.get("one")).isEqualTo(2);
    }

    @Test
    public void givenKey_whenRemove_thenSizeDecreased() {
        hashMap.put("one", 1);
        hashMap.remove("one");
        assertThat(hashMap.size()).isZero();
    }

    @Test
    public void givenKey_whenGet_thenReturnsValue() {
        hashMap.put("one", 1);
        assertThat(hashMap.get("one")).isEqualTo(1);
    }

    @Test
    public void givenKey_whenContainsKey_thenReturnsTrue() {
        hashMap.put("one", 1);
        assertThat(hashMap.containsKey("one")).isTrue();
    }

    @Test
    public void givenNonExistingKey_whenContainsKey_thenReturnsFalse() {
        assertThat(hashMap.containsKey("one")).isFalse();
    }
}