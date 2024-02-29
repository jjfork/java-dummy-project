package org.example.datastructures.caches;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LFUCacheTests {

    @Test
    public void testGet() {
        // Arrange
        LFUCache<Integer, String> cache = new LFUCache<>(3);
        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");

        // Act
        String result = cache.get(2);

        // Assert
        assertThat(result).isEqualTo("Two");
    }

    @Test
    public void testPut() {
        // Arrange
        LFUCache<Integer, String> cache = new LFUCache<>(3);

        // Act
        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");

        // Assert
        assertThat(cache.get(1)).isEqualTo("One");
        assertThat(cache.get(2)).isEqualTo("Two");
        assertThat(cache.get(3)).isEqualTo("Three");
    }

    @Test
    public void testPutWithCapacityExceeded() {
        // Arrange
        LFUCache<Integer, String> cache = new LFUCache<>(2);
        cache.put(1, "One");
        cache.put(2, "Two");

        // Act
        cache.put(3, "Three");

        // Assert
        assertThat(cache.get(1)).isNull();
        assertThat(cache.get(2)).isEqualTo("Two");
        assertThat(cache.get(3)).isEqualTo("Three");
    }
}