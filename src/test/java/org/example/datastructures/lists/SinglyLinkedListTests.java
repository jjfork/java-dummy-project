package org.example.datastructures.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SinglyLinkedListTests {

    private SinglyLinkedList singlyLinkedList;

    @BeforeEach
    public void setUp() {
        singlyLinkedList = new SinglyLinkedList();
    }

    @Test
    public void testDetectLoop() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        singlyLinkedList.setHead(node1);
        boolean result = singlyLinkedList.detectLoop();
        assertThat(result).isTrue();
    }

    @Test
    public void testMiddle() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        singlyLinkedList.setHead(node1);
        Node result = singlyLinkedList.middle();
        assertThat(result).isEqualTo(node2);
    }

    @Test
    public void testSwapNodes() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        singlyLinkedList.setHead(node1);
        singlyLinkedList.swapNodes(1, 3);
        assertThat(singlyLinkedList.toString()).isEqualTo("3->2->1");
    }
}