package org.example.datastructures.caches;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LFUCacheTests {

    @Test
    public void testGetExistingKey() {
        LFUCache<Integer, String> cache = new LFUCache<>(2);
        cache.put(1, "One");
        cache.put(2, "Two");

        String value = cache.get(1);

        assertThat(value).isEqualTo("One");
    }

    @Test
    public void testGetNonExistingKey() {
        LFUCache<Integer, String> cache = new LFUCache<>(2);
        cache.put(1, "One");
        cache.put(2, "Two");

        String value = cache.get(3);

        assertThat(value).isNull();
    }

    @Test
    public void testPutExistingKey() {
        LFUCache<Integer, String> cache = new LFUCache<>(2);
        cache.put(1, "One");
        cache.put(2, "Two");

        cache.put(1, "NewOne");
        String value = cache.get(1);

        assertThat(value).isEqualTo("NewOne");
    }

    @Test
    public void testPutNewKeyWithFullCapacity() {
        LFUCache<Integer, String> cache = new LFUCache<>(2);
        cache.put(1, "One");
        cache.put(2, "Two");

        cache.put(3, "Three");
        String value = cache.get(1);

        assertThat(value).isNull();
    }

    @Test
    public void testPutNewKeyWithAvailableCapacity() {
        LFUCache<Integer, String> cache = new LFUCache<>(2);
        cache.put(1, "One");
        cache.put(2, "Two");

        cache.put(3, "Three");
        String value = cache.get(3);

        assertThat(value).isEqualTo("Three");
    }
}
