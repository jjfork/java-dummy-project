package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayDeque;

@ExtendWith(MockitoExtension.class)
public class ArrayDequeTests {

    @Test
    public void testAddFirst() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(5);
        assertEquals(5, arrayDeque.getFirst());
    }

    @Test
    public void testAddLast() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(10);
        assertEquals(10, arrayDeque.getLast());
    }

    @Test
    public void testRemoveFirst() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(15);
        arrayDeque.addLast(20);
        arrayDeque.removeFirst();
        assertEquals(20, arrayDeque.getFirst());
    }

    @Test
    public void testRemoveLast() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(25);
        arrayDeque.addLast(30);
        arrayDeque.removeLast();
        assertEquals(25, arrayDeque.getLast());
    }

    @Test
    public void testGetFirst() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(35);
        arrayDeque.addLast(40);
        assertEquals(35, arrayDeque.getFirst());
    }

    @Test
    public void testGetLast() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(45);
        arrayDeque.addLast(50);
        assertEquals(50, arrayDeque.getLast());
    }
}