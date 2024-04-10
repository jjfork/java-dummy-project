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
public class MergeSortedSinglyLinkedListTests {

    @Test
    public void testMerge() {
        SinglyLinkedList listA = new SinglyLinkedList(new Node(1, new Node(3, new Node(5, null))), 3);
        SinglyLinkedList listB = new SinglyLinkedList(new Node(2, new Node(4, new Node(6, null))), 3);

        long startTime = System.nanoTime();
        SinglyLinkedList mergedList = MergeSortedSinglyLinkedList.merge(listA, listB);
        long endTime = System.nanoTime();

        assertThat(mergedList.size()).isEqualTo(6);
        assertThat(mergedList.getHead().value).isEqualTo(1);
        assertThat(mergedList.getHead().next.value).isEqualTo(2);
        assertThat(mergedList.getHead().next.next.value).isEqualTo(3);
        assertThat(mergedList.getHead().next.next.next.value).isEqualTo(4);
        assertThat(mergedList.getHead().next.next.next.next.value).isEqualTo(5);
        assertThat(mergedList.getHead().next.next.next.next.next.value).isEqualTo(6);

        long executionTime = endTime - startTime;
        assertThat(executionTime).isLessThan(1000000); // Ensure test executes under 1 millisecond
    }
}