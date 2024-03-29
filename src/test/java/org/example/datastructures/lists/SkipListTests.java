package org.example.datastructures.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class SkipListTests {

    private SkipList<Integer> skipList;

    @BeforeEach
    public void setUp() {
        skipList = new SkipList<>();
    }

    @Test
    public void testAdd() {
        for (int i = 0; i < 100000; i++) {
            skipList.add(i);
        }
        assertThat(skipList.size()).isEqualTo(100000);
        assertThat(skipList.contains(50000)).isTrue();
    }

    @Test
    public void testGet() {
        for (int i = 0; i < 100000; i++) {
            skipList.add(i);
        }
        assertThat(skipList.get(0)).isEqualTo(0);
        assertThat(skipList.get(99999)).isEqualTo(99999);
    }

    @Test
    public void testRemove() {
        for (int i = 0; i < 100000; i++) {
            skipList.add(i);
        }
        assertThat(skipList.size()).isEqualTo(100000);
        skipList.remove(50000);
        assertThat(skipList.size()).isEqualTo(99999);
        assertThat(skipList.contains(50000)).isFalse();
    }

    @Test
    public void testContains() {
        for (int i = 0; i < 100000; i++) {
            skipList.add(i);
        }
        assertThat(skipList.contains(50000)).isTrue();
        assertThat(skipList.contains(100000)).isFalse();
    }

    @Test
    public void testSize() {
        assertThat(skipList.size()).isZero();
        for (int i = 0; i < 100000; i++) {
            skipList.add(i);
        }
        assertThat(skipList.size()).isEqualTo(100000);
    }
}