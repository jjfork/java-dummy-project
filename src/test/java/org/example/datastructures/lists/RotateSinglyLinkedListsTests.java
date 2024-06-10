package org.example.datastructures.lists;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class RotateSinglyLinkedListsTests {

    @Test
    public void testRotateRight() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        RotateSinglyLinkedLists rotateSinglyLinkedLists = new RotateSinglyLinkedLists();

        Node result = rotateSinglyLinkedLists.rotateRight(node1, 2);

        assertThat(result).isNotNull();
        assertThat(result.value).isEqualTo(3);
        assertThat(result.next.value).isEqualTo(4);
        assertThat(result.next.next.value).isEqualTo(1);
        assertThat(result.next.next.next.value).isEqualTo(2);
        assertThat(result.next.next.next.next).isNull();
    }
}
