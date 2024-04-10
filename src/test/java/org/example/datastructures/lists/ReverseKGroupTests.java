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
public class ReverseKGroupTests {

    @Test
    public void testReverseKGroup() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ReverseKGroup reverseKGroup = new ReverseKGroup();
        Node reversed = reverseKGroup.reverseKGroup(node1, 2);

        assertThat(reversed.value).isEqualTo(2);
        assertThat(reversed.next.value).isEqualTo(1);
        assertThat(reversed.next.next.value).isEqualTo(4);
        assertThat(reversed.next.next.next.value).isEqualTo(3);
        assertThat(reversed.next.next.next.next.value).isEqualTo(5);
    }

    @Test
    public void testLength() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;

        ReverseKGroup reverseKGroup = new ReverseKGroup();
        int length = reverseKGroup.length(node1);

        assertThat(length).isEqualTo(3);
    }

    @Test
    public void testReverse() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;

        ReverseKGroup reverseKGroup = new ReverseKGroup();
        Node reversed = reverseKGroup.reverse(node1, 3, 2);

        assertThat(reversed.value).isEqualTo(2);
        assertThat(reversed.next.value).isEqualTo(1);
        assertThat(reversed.next.next.value).isEqualTo(3);
    }
}
