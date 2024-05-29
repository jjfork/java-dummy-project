package org.example.datastructures.lists;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class MergeSortedSinglyLinkedListTests {

    @Test
    public void testMerge() {
        SinglyLinkedList listA = new SinglyLinkedList();
        listA.insert(1);
        listA.insert(3);
        listA.insert(5);

        SinglyLinkedList listB = new SinglyLinkedList();
        listB.insert(2);
        listB.insert(4);
        listB.insert(6);

        SinglyLinkedList mergedList = MergeSortedSinglyLinkedList.merge(listA, listB);

        assertThat(mergedList).isNotNull();
        assertThat(mergedList.size()).isEqualTo(6);
        assertThat(mergedList.toString()).isEqualTo("1->2->3->4->5->6");
    }
}
