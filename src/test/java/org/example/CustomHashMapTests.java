package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CustomHashMapTests {

    @Test
    public void testPut() {
        // Given
        CustomHashMap<String, Integer> customHashMap = new CustomHashMap<>();
        
        // When
        customHashMap.put("key1", 1);
        customHashMap.put("key2", 2);
        
        // Then
        assertThat(customHashMap.get("key1")).isEqualTo(1);
        assertThat(customHashMap.get("key2")).isEqualTo(2);
    }

    @Test
    public void testGet() {
        // Given
        CustomHashMap<String, Integer> customHashMap = new CustomHashMap<>();
        customHashMap.put("key1", 1);
        
        // When
        Integer value = customHashMap.get("key1");
        
        // Then
        assertThat(value).isEqualTo(1);
    }

    @Test
    public void testRemove() {
        // Given
        CustomHashMap<String, Integer> customHashMap = new CustomHashMap<>();
        customHashMap.put("key1", 1);
        
        // When
        Integer removedValue = customHashMap.remove("key1");
        
        // Then
        assertThat(removedValue).isEqualTo(1);
        assertThat(customHashMap.get("key1")).isNull();
    }

    @Test
    public void testKeySet() {
        // Given
        CustomHashMap<String, Integer> customHashMap = new CustomHashMap<>();
        customHashMap.put("key1", 1);
        customHashMap.put("key2", 2);
        
        // When
        Set<String> keySet = customHashMap.keySet();
        
        // Then
        assertThat(keySet).contains("key1", "key2");
    }
}