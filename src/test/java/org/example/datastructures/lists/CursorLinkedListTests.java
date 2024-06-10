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
public class CursorLinkedListTests {

    @Test
    public void testAppend() {
        CursorLinkedList<String> list = new CursorLinkedList<>();
        list.append("A");
        list.append("B");
        list.append("C");

        assertThat(list.get(0)).isEqualTo("A");
        assertThat(list.get(1)).isEqualTo("B");
        assertThat(list.get(2)).isEqualTo("C");
    }

    @Test
    public void testRemove() {
        CursorLinkedList<String> list = new CursorLinkedList<>();
        list.append("A");
        list.append("B");
        list.append("C");

        list.remove("B");

        assertThat(list.get(0)).isEqualTo("A");
        assertThat(list.get(1)).isEqualTo("C");
    }

    @Test
    public void testIndexOf() {
        CursorLinkedList<String> list = new CursorLinkedList<>();
        list.append("A");
        list.append("B");
        list.append("C");

        int index = list.indexOf("B");

        assertThat(index).isEqualTo(1);
    }

    @Test
    public void testRemoveByIndex() {
        CursorLinkedList<String> list = new CursorLinkedList<>();
        list.append("A");
        list.append("B");
        list.append("C");

        list.removeByIndex(1);

        assertThat(list.get(0)).isEqualTo("A");
        assertThat(list.get(1)).isEqualTo("C");
    }
}