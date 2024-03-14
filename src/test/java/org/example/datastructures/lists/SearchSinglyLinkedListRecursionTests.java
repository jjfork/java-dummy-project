package org.example.datastructures.lists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SearchSinglyLinkedListRecursionTests {

    @Test
    public void testSearch_ExistingKey_ReturnsTrue() {
        // Arrange
        SearchSinglyLinkedListRecursion list = new SearchSinglyLinkedListRecursion();
        list.insert(5);

        // Act
        boolean result = list.search(5);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testSearch_NonExistingKey_ReturnsFalse() {
        // Arrange
        SearchSinglyLinkedListRecursion list = new SearchSinglyLinkedListRecursion();
        list.insert(5);

        // Act
        boolean result = list.search(10);

        // Assert
        assertThat(result).isFalse();
    }

    @Test
    public void testSearch_EmptyList_ReturnsFalse() {
        // Arrange
        SearchSinglyLinkedListRecursion list = new SearchSinglyLinkedListRecursion();

        // Act
        boolean result = list.search(5);

        // Assert
        assertThat(result).isFalse();
    }

    @Test
    public void testSearch_MultipleKeys_ReturnsTrue() {
        // Arrange
        SearchSinglyLinkedListRecursion list = new SearchSinglyLinkedListRecursion();
        list.insert(5);
        list.insert(10);
        list.insert(15);

        // Act
        boolean result1 = list.search(5);
        boolean result2 = list.search(10);
        boolean result3 = list.search(15);

        // Assert
        assertThat(result1).isTrue();
        assertThat(result2).isTrue();
        assertThat(result3).isTrue();
    }
}