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
public class QuickSortLinkedListTests {

    @Test
    public void testSortList() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(3);
        list.insert(1);
        list.insert(2);
        QuickSortLinkedList quickSortLinkedList = new QuickSortLinkedList(list);
        quickSortLinkedList.sortList();
        assertThat(list.toString()).isEqualTo("1->2->3");
    }

    @Test
    public void testSortListEmptyList() {
        SinglyLinkedList list = new SinglyLinkedList();
        QuickSortLinkedList quickSortLinkedList = new QuickSortLinkedList(list);
        quickSortLinkedList.sortList();
        assertThat(list.toString()).isEqualTo("");
    }

    @Test
    public void testSortListSingleElement() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        QuickSortLinkedList quickSortLinkedList = new QuickSortLinkedList(list);
        quickSortLinkedList.sortList();
        assertThat(list.toString()).isEqualTo("1");
    }

    @Test
    public void testSortListAlreadySorted() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        QuickSortLinkedList quickSortLinkedList = new QuickSortLinkedList(list);
        quickSortLinkedList.sortList();
        assertThat(list.toString()).isEqualTo("1->2->3");
    }

    @Test
    public void testSortListReverseSorted() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(3);
        list.insert(2);
        list.insert(1);
        QuickSortLinkedList quickSortLinkedList = new QuickSortLinkedList(list);
        quickSortLinkedList.sortList();
        assertThat(list.toString()).isEqualTo("1->2->3");
    }

}
