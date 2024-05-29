package org.example.datastructures.lists;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CircleLinkedListTests {

    private CircleLinkedList<Integer> circleLinkedList;

    @BeforeEach
    public void setUp() {
        circleLinkedList = new CircleLinkedList<>();
    }

    @Test
    public void testGetSize() {
        assertEquals(0, circleLinkedList.getSize());
    }

    @Test
    public void testAppend() {
        circleLinkedList.append(1);
        circleLinkedList.append(2);
        assertEquals(2, circleLinkedList.getSize());
    }

    @Test
    public void testAppendNullValue() {
        assertThrows(NullPointerException.class, () -> circleLinkedList.append(null));
    }

    @Test
    public void testToString() {
        circleLinkedList.append(1);
        circleLinkedList.append(2);
        assertEquals("[ 1 , 2 ]", circleLinkedList.toString());
    }

    @Test
    public void testRemove() {
        circleLinkedList.append(1);
        circleLinkedList.append(2);
        assertEquals(2, circleLinkedList.getSize());
        assertEquals(1, circleLinkedList.remove(0));
        assertEquals(1, circleLinkedList.getSize());
    }

    @Test
    public void testRemoveInvalidPosition() {
        assertThrows(IndexOutOfBoundsException.class, () -> circleLinkedList.remove(2));
    }
}