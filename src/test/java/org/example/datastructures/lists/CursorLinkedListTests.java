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
        cursorLinkedList.append("C");
        assertThat(cursorLinkedList.get(0)).isEqualTo("A");
        assertThat(cursorLinkedList.get(1)).isEqualTo("B");
        assertThat(cursorLinkedList.get(2)).isEqualTo("C");
    }

    @Test
    public void testRemove() {
        cursorLinkedList.append("A");
        cursorLinkedList.append("B");
        cursorLinkedList.append("C");
        cursorLinkedList.remove("B");
        assertThat(cursorLinkedList.get(0)).isEqualTo("A");
        assertThat(cursorLinkedList.get(1)).isEqualTo("C");
    }

    @Test
    public void testIndexOf() {
        cursorLinkedList.append("A");
        cursorLinkedList.append("B");
        cursorLinkedList.append("C");
        assertThat(cursorLinkedList.indexOf("B")).isEqualTo(1);
    }
}