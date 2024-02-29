package org.example.datastructures.lists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CountSinglyLinkedListRecursionTests {

    @Test
    public void testCountRecursion() {
        // Given
        CountSinglyLinkedListRecursion list = new CountSinglyLinkedListRecursion();
        list.insert(1);
        list.insert(2);
        list.insert(3);

        // When
        int count = list.count();

        // Then
        assertThat(count).isEqualTo(3);
    }
}