package org.example.datastructures.caches;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(MockitoExtension.class)
public class LRUCacheTests {

    private LRUCache<String, Integer> lruCache;

    @BeforeEach
    public void setUp() {
        lruCache = new LRUCache<>(3);
    }

    @Test
    public void testGetExistingKey() {
        lruCache.put("A", 1);
        lruCache.put("B", 2);
        lruCache.put("C", 3);
        Integer value = lruCache.get("A");
        assertEquals(1, value);
    }

    @Test
    public void testGetNonExistingKey() {
        Integer value = lruCache.get("D");
        assertNull(value);
    }

    @Test
    public void testPutExistingKey() {
        lruCache.put("A", 1);
        lruCache.put("B", 2);
        lruCache.put("C", 3);
        lruCache.put("A", 4);
        Integer value = lruCache.get("A");
        assertEquals(4, value);
    }

    @Test
    public void testEviction() {
        lruCache.put("A", 1);
        lruCache.put("B", 2);
        lruCache.put("C", 3);
        lruCache.put("D", 4);
        Integer value = lruCache.get("A");
        assertNull(value);
    }
}