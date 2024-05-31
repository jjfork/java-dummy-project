package org.example.datastructures.lists;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class CircleLinkedListTests {

    @Test
    public void testAppend() {
        CircleLinkedList<Integer> list = new CircleLinkedList<>();
        list.append(1);
        list.append(2);
        assertEquals(2, list.getSize());
    }

    @Test
    public void testRemove() {
        CircleLinkedList<String> list = new CircleLinkedList<>();
        list.append("A");
        list.append("B");
        list.append("C");
        assertEquals("B", list.remove(1));
        assertEquals(2, list.getSize());
    }

    @Test
    public void testAppendNullValue() {
        CircleLinkedList<String> list = new CircleLinkedList<>();
        assertThrows(NullPointerException.class, () -> list.append(null));
    }

    @Test
    public void testRemoveInvalidPosition() {
        CircleLinkedList<Integer> list = new CircleLinkedList<>();
        list.append(1);
        list.append(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(3));
    }

    @Test
    public void testToString() {
        CircleLinkedList<Integer> list = new CircleLinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        assertThat(list.toString()).isEqualTo("[ 1 , 2 , 3 ]");
    }
}
