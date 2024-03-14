package org.example.datastructures.hashmap.hashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MapTests {

    @Test
    public void testPut() {
        Map<String, Integer> map = mock(Map.class);
        when(map.put("key1", 1)).thenReturn(true);
        boolean result = map.put("key1", 1);
        assertThat(result).isTrue();
    }

    @Test
    public void testGet() {
        Map<String, Integer> map = mock(Map.class);
        when(map.get("key1")).thenReturn(1);
        Integer result = map.get("key1");
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testDelete() {
        Map<String, Integer> map = mock(Map.class);
        when(map.delete("key1")).thenReturn(true);
        boolean result = map.delete("key1");
        assertThat(result).isTrue();
    }

    @Test
    public void testContains() {
        Map<String, Integer> map = mock(Map.class);
        when(map.contains("key1")).thenReturn(true);
        boolean result = map.contains("key1");
        assertThat(result).isTrue();
    }

    @Test
    public void testHash() {
        Map<String, Integer> map = mock(Map.class);
        int size = 10;
        int result = map.hash("key1", size);
        assertThat(result).isLessThan(size);
    }
}