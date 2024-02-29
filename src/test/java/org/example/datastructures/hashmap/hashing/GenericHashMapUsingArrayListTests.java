package org.example.datastructures.hashmap.hashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GenericHashMapUsingArrayListTests {

    @Test
    public void testPut() {
        // Arrange
        GenericHashMapUsingArrayList<String, Integer> hashMap = new GenericHashMapUsingArrayList<>();
        
        // Act
        hashMap.put("key1", 1);
        
        // Assert
        assertThat(hashMap.size()).isEqualTo(1);
    }

    @Test
    public void testGet() {
        // Arrange
        GenericHashMapUsingArrayList<String, Integer> hashMap = new GenericHashMapUsingArrayList<>();
        hashMap.put("key1", 1);
        
        // Act
        Integer value = hashMap.get("key1");
        
        // Assert
        assertThat(value).isEqualTo(1);
    }

    @Test
    public void testRemove() {
        // Arrange
        GenericHashMapUsingArrayList<String, Integer> hashMap = new GenericHashMapUsingArrayList<>();
        hashMap.put("key1", 1);
        
        // Act
        hashMap.remove("key1");
        
        // Assert
        assertThat(hashMap.size()).isZero();
    }

    @Test
    public void testContainsKey() {
        // Arrange
        GenericHashMapUsingArrayList<String, Integer> hashMap = new GenericHashMapUsingArrayList<>();
        hashMap.put("key1", 1);
        
        // Act
        boolean containsKey = hashMap.containsKey("key1");
        
        // Assert
        assertThat(containsKey).isTrue();
    }
}