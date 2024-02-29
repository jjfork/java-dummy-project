package org.example.datastructures.lists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class RotateSinglyLinkedListsTests {

    @Test
    public void testRotateRight_whenListIsNull_shouldReturnNull() {
        // Arrange
        RotateSinglyLinkedLists rotateSinglyLinkedLists = new RotateSinglyLinkedLists();
        Node head = null;
        int k = 3;

        // Act
        Node result = rotateSinglyLinkedLists.rotateRight(head, k);

        // Assert
        assertThat(result).isNull();
    }

    @Test
    public void testRotateRight_whenListHasOnlyOneNode_shouldReturnSameList() {
        // Arrange
        RotateSinglyLinkedLists rotateSinglyLinkedLists = new RotateSinglyLinkedLists();
        Node head = new Node(1);
        int k = 2;

        // Act
        Node result = rotateSinglyLinkedLists.rotateRight(head, k);

        // Assert
        assertThat(result).isEqualTo(head);
    }

    @Test
    public void testRotateRight_whenKIsZero_shouldReturnSameList() {
        // Arrange
        RotateSinglyLinkedLists rotateSinglyLinkedLists = new RotateSinglyLinkedLists();
        Node head = new Node(1);
        head.next = new Node(2);
        int k = 0;

        // Act
        Node result = rotateSinglyLinkedLists.rotateRight(head, k);

        // Assert
        assertThat(result).isEqualTo(head);
    }

    // Add more test cases as needed
}