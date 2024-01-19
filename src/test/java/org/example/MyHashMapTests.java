package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyHashMapTests {

    @Test
    public void testPutAndGet() {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        assertThat(map.get("one")).isEqualTo(1);
        assertThat(map.get("two")).isEqualTo(2);
    }

    @Test
    public void testRemove() {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("one", 1);
        map.remove("one");
        assertThat(map.get("one")).isNull();
    }

    @Test
    public void testResize() {
        MyHashMap<String, Integer> map = new MyHashMap<>(2, 0.5f);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        assertThat(map.get("one")).isEqualTo(1);
        assertThat(map.get("two")).isEqualTo(2);
        assertThat(map.get("three")).isEqualTo(3);
    }
}