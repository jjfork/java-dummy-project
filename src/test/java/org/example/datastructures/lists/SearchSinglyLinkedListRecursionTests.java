package org.example.datastructures.lists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SearchSinglyLinkedListRecursionTests {

    @Test
    public void givenEmptyList_whenSearch_thenReturnFalse() {
        SearchSinglyLinkedListRecursion list = new SearchSinglyLinkedListRecursion();
        boolean result = list.search(5);
        assertThat(result).isFalse();
    }

    @Test
    public void givenListWithElements_whenSearchExistingElement_thenReturnTrue() {
        SearchSinglyLinkedListRecursion list = new SearchSinglyLinkedListRecursion();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        boolean result = list.search(10);
        assertThat(result).isTrue();
    }

    @Test
    public void givenListWithElements_whenSearchNonExistingElement_thenReturnFalse() {
        SearchSinglyLinkedListRecursion list = new SearchSinglyLinkedListRecursion();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        boolean result = list.search(20);
        assertThat(result).isFalse();
    }
}