package org.example.datastructures.lists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SkipListTests {

    @Test
    public void testAdd() {
        // Arrange
        SkipList<Integer> skipList = new SkipList<>();
        int element = 5;

        // Act
        skipList.add(element);

        // Assert
        assertThat(skipList.size()).isEqualTo(1);
        assertThat(skipList.contains(element)).isTrue();
    }

    @Test
    public void testGet() {
        // Arrange
        SkipList<String> skipList = new SkipList<>();
        String element = "test";
        skipList.add(element);

        // Act
        String result = skipList.get(0);

        // Assert
        assertThat(result).isEqualTo(element);
    }

    @Test
    public void testRemove() {
        // Arrange
        SkipList<Integer> skipList = new SkipList<>();
        int element = 10;
        skipList.add(element);

        // Act
        skipList.remove(element);

        // Assert
        assertThat(skipList.size()).isZero();
        assertThat(skipList.contains(element)).isFalse();
    }

    @Test
    public void testContains() {
        // Arrange
        SkipList<String> skipList = new SkipList<>();
        String element = "hello";
        skipList.add(element);

        // Act
        boolean result = skipList.contains(element);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testSize() {
        // Arrange
        SkipList<Integer> skipList = new SkipList<>();
        skipList.add(1);
        skipList.add(2);
        skipList.add(3);

        // Act
        int size = skipList.size();

        // Assert
        assertThat(size).isEqualTo(3);
    }
}