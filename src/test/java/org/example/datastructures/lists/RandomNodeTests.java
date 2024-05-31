package org.example.datastructures.lists;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RandomNodeTests {

    @Test
    public void testGetRandom() {
        RandomNode.ListNode node1 = new RandomNode.ListNode(1);
        RandomNode.ListNode node2 = new RandomNode.ListNode(2);
        RandomNode.ListNode node3 = new RandomNode.ListNode(3);

        node1.next = node2;
        node2.next = node3;

        RandomNode randomNode = new RandomNode(node1);

        assertThat(randomNode.getRandom()).isIn(1, 2, 3);
    }

    @Test
    public void testGetRandomWithMock() {
        RandomNode.ListNode node1 = new RandomNode.ListNode(1);
        RandomNode.ListNode node2 = new RandomNode.ListNode(2);
        RandomNode.ListNode node3 = new RandomNode.ListNode(3);

        node1.next = node2;
        node2.next = node3;

        RandomNode randomNode = new RandomNode(node1);

        RandomNode randomNodeMock = mock(RandomNode.class);
        when(randomNodeMock.getRandom()).thenReturn(2);

        assertThat(randomNodeMock.getRandom()).isEqualTo(2);
    }
}