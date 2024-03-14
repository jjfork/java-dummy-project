package org.example.datastructures.caches;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LFUCacheTests {

    @Test
    public void givenKey_whenGet_thenReturnValue() {
        // Arrange
        LFUCache<Integer, String> cache = new LFUCache<>(2);
        cache.put(1, "one");
        
        // Act
        String result = cache.get(1);
        
        // Assert
        assertThat(result).isEqualTo("one");
    }

    @Test
    public void givenNonExistentKey_whenGet_thenReturnNull() {
        // Arrange
        LFUCache<Integer, String> cache = new LFUCache<>(2);
        
        // Act
        String result = cache.get(1);
        
        // Assert
        assertThat(result).isNull();
    }

    @Test
    public void givenExistingKey_whenPut_thenReturnUpdatedValue() {
        // Arrange
        LFUCache<Integer, String> cache = new LFUCache<>(2);
        cache.put(1, "one");
        
        // Act
        cache.put(1, "updated");
        String result = cache.get(1);
        
        // Assert
        assertThat(result).isEqualTo("updated");
    }

    @Test
    public void givenFullCache_whenPutNewKey_thenRemoveLFU() {
        // Arrange
        LFUCache<Integer, String> cache = new LFUCache<>(2);
        cache.put(1, "one");
        cache.put(2, "two");
        
        // Act
        cache.put(3, "three");
        String result = cache.get(1);
        
        // Assert
        assertThat(result).isNull();
    }
}