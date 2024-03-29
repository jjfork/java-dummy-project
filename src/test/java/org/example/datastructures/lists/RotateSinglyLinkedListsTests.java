package org.example.datastructures.lists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class RotateSinglyLinkedListsTests {

    @Test
    public void testRotateRight_whenListIsNull_thenReturnNull() {
        RotateSinglyLinkedLists rotateSinglyLinkedLists = new RotateSinglyLinkedLists();
        Node head = null;
        int k = 3;

        Node result = rotateSinglyLinkedLists.rotateRight(head, k);

        assertThat(result).isNull();
    }

    @Test
    public void testRotateRight_whenListHasOnlyOneNode_thenReturnSameList() {
        RotateSinglyLinkedLists rotateSinglyLinkedLists = new RotateSinglyLinkedLists();
        Node head = new Node(1);
        int k = 2;

        Node result = rotateSinglyLinkedLists.rotateRight(head, k);

        assertThat(result).isEqualTo(head);
    }

    @Test
    public void testRotateRight_whenKIsZero_thenReturnSameList() {
        RotateSinglyLinkedLists rotateSinglyLinkedLists = new RotateSinglyLinkedLists();
        Node head = new Node(1);
        head.next = new Node(2);
        int k = 0;

        Node result = rotateSinglyLinkedLists.rotateRight(head, k);

        assertThat(result).isEqualTo(head);
    }
}