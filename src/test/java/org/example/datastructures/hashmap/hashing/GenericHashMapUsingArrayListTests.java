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
        GenericHashMapUsingArrayList<String, Integer> map = new GenericHashMapUsingArrayList<>();
        
        // Act
        map.put("key1", 1);
        
        // Assert
        assertThat(map.size()).isEqualTo(1);
    }

    @Test
    public void testGet() {
        // Arrange
        GenericHashMapUsingArrayList<String, Integer> map = new GenericHashMapUsingArrayList<>();
        map.put("key1", 1);
        
        // Act
        Integer result = map.get("key1");
        
        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testRemove() {
        // Arrange
        GenericHashMapUsingArrayList<String, Integer> map = new GenericHashMapUsingArrayList<>();
        map.put("key1", 1);
        
        // Act
        map.remove("key1");
        
        // Assert
        assertThat(map.size()).isZero();
    }

    @Test
    public void testContainsKey() {
        // Arrange
        GenericHashMapUsingArrayList<String, Integer> map = new GenericHashMapUsingArrayList<>();
        map.put("key1", 1);
        
        // Act
        boolean result = map.containsKey("key1");
        
        // Assert
        assertThat(result).isTrue();
    }
}