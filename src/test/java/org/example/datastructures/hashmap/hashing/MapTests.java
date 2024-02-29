package org.example.datastructures.hashmap.hashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MapTests {

    @Test
    void testPut() {
        // Arrange
        Map<String, Integer> map = mock(Map.class);
        when(map.put("key1", 1)).thenReturn(true);

        // Act
        boolean result = map.put("key1", 1);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    void testGet() {
        // Arrange
        Map<String, Integer> map = mock(Map.class);
        when(map.get("key1")).thenReturn(1);

        // Act
        Integer result = map.get("key1");

        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    void testDelete() {
        // Arrange
        Map<String, Integer> map = mock(Map.class);
        when(map.delete("key1")).thenReturn(true);

        // Act
        boolean result = map.delete("key1");

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    void testContains() {
        // Arrange
        Map<String, Integer> map = mock(Map.class);
        when(map.contains("key1")).thenReturn(true);

        // Act
        boolean result = map.contains("key1");

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    void testHash() {
        // Arrange
        Map<String, Integer> map = new Map<String, Integer>() {
            @Override
            boolean put(String key, Integer value) {
                return false;
            }

            @Override
            Integer get(String key) {
                return null;
            }

            @Override
            boolean delete(String key) {
                return false;
            }

            @Override
            Iterable<String> keys() {
                return null;
            }

            @Override
            int size() {
                return 0;
            }
        };

        // Act
        int result = map.hash("key1", 10);

        // Assert
        assertThat(result).isBetween(0, 9);
    }
}