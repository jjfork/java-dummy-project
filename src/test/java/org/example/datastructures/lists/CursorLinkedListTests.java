package org.example.datastructures.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CursorLinkedListTests {

    private CursorLinkedList<String> cursorLinkedList;

    @BeforeEach
    public void setUp() {
        cursorLinkedList = new CursorLinkedList<>();
    }

    @Test
    public void testAppend() {
        cursorLinkedList.append("A");
        cursorLinkedList.append("B");
        assertThat(cursorLinkedList.get(0)).isEqualTo("A");
        assertThat(cursorLinkedList.get(1)).isEqualTo("B");
    }

    @Test
    public void testRemove() {
        cursorLinkedList.append("A");
        cursorLinkedList.append("B");
        cursorLinkedList.remove("A");
        assertThat(cursorLinkedList.get(0)).isEqualTo("B");
    }

    @Test
    public void testIndexOf() {
        cursorLinkedList.append("A");
        cursorLinkedList.append("B");
        assertThat(cursorLinkedList.indexOf("B")).isEqualTo(1);
    }

    @Test
    public void testRemoveByIndex() {
        cursorLinkedList.append("A");
        cursorLinkedList.append("B");
        cursorLinkedList.removeByIndex(0);
        assertThat(cursorLinkedList.get(0)).isEqualTo("B");
    }

    @Test
    public void testGet() {
        cursorLinkedList.append("A");
        cursorLinkedList.append("B");
        assertThat(cursorLinkedList.get(1)).isEqualTo("B");
    }
}