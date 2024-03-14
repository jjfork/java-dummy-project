package org.example.datastructures.caches;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LRUCacheTests {

    private LRUCache<Integer, String> lruCache;

    @BeforeEach
    public void setUp() {
        lruCache = new LRUCache<>(3);
    }

    @Test
    public void givenNewCache_whenPut_thenValueIsAdded() {
        lruCache.put(1, "One");
        assertThat(lruCache.get(1)).isEqualTo("One");
    }

    @Test
    public void givenExistingKey_whenPut_thenValueIsUpdated() {
        lruCache.put(2, "Two");
        lruCache.put(2, "NewTwo");
        assertThat(lruCache.get(2)).isEqualTo("NewTwo");
    }

    @Test
    public void givenFullCache_whenPutNewKey_thenOldestEntryIsEvicted() {
        lruCache.put(1, "One");
        lruCache.put(2, "Two");
        lruCache.put(3, "Three");
        lruCache.put(4, "Four");
        assertThat(lruCache.get(1)).isNull();
    }

    @Test
    public void givenExistingKey_whenGet_thenEntryIsMovedToLast() {
        lruCache.put(1, "One");
        lruCache.put(2, "Two");
        lruCache.get(1);
        lruCache.put(3, "Three");
        assertThat(lruCache.get(1)).isEqualTo("One");
    }
}