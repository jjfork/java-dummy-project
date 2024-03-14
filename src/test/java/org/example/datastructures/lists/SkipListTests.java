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
        skipList.add(5);
        assertThat(skipList.size()).isEqualTo(1);
        assertThat(skipList.contains(5)).isTrue();
    }

    @Test
    public void testGet() {
        skipList.add(10);
        assertThat(skipList.get(0)).isEqualTo(10);
    }

    @Test
    public void testRemove() {
        skipList.add(15);
        skipList.remove(15);
        assertThat(skipList.size()).isZero();
        assertThat(skipList.contains(15)).isFalse();
    }

    @Test
    public void testContains() {
        skipList.add(20);
        assertThat(skipList.contains(20)).isTrue();
        assertThat(skipList.contains(25)).isFalse();
    }

    @Test
    public void testSize() {
        skipList.add(30);
        assertThat(skipList.size()).isEqualTo(1);
    }
}