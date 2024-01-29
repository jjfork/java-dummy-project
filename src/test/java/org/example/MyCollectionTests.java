package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyCollectionTests {

    @Test
    public void testSize() {
        // Arrange
        MyCollection<Integer> collection = new MyCollection<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);

        // Act
        int size = collection.size();

        // Assert
        assertThat(size).isEqualTo(3);
    }

    @Test
    public void testIsEmpty() {
        // Arrange
        MyCollection<String> collection = new MyCollection<>();

        // Act
        boolean isEmpty = collection.isEmpty();

        // Assert
        assertThat(isEmpty).isTrue();
    }

    @Test
    public void testContains() {
        // Arrange
        MyCollection<String> collection = new MyCollection<>();
        collection.add("apple");
        collection.add("banana");
        collection.add("orange");

        // Act
        boolean contains = collection.contains("banana");

        // Assert
        assertThat(contains).isTrue();
    }

    // Other test methods...
}