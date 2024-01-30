package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class CustomHashMapTests {

    @Test
    public void testPut() {
        // Given
        CustomHashMap<String, Integer> customHashMap = new CustomHashMap<>();
        
        // When
        customHashMap.put("key1", 1);
        
        // Then
        // Add assertions here
    }

    @Test
    public void testGet() {
        // Given
        CustomHashMap<String, Integer> customHashMap = new CustomHashMap<>();
        customHashMap.put("key1", 1);
        
        // When
        Integer value = customHashMap.get("key1");
        
        // Then
        // Add assertions here
    }

    @Test
    public void testRemove() {
        // Given
        CustomHashMap<String, Integer> customHashMap = new CustomHashMap<>();
        customHashMap.put("key1", 1);
        
        // When
        Integer value = customHashMap.remove("key1");
        
        // Then
        // Add assertions here
    }

    @Test
    public void testKeySet() {
        // Given
        CustomHashMap<String, Integer> customHashMap = new CustomHashMap<>();
        customHashMap.put("key1", 1);
        
        // When
        Set<String> keys = customHashMap.keySet();
        
        // Then
        // Add assertions here
    }
}