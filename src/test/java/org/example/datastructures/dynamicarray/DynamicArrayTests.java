package org.example.datastructures.dynamicarray;

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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class DynamicArrayTests {

    @Test
    void testAdd() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(1);
        dynamicArray.add(2);
        assertEquals(2, dynamicArray.getSize());
    }

    @Test
    void testGet() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("Hello");
        dynamicArray.add("World");
        assertEquals("Hello", dynamicArray.get(0));
    }

    @Test
    void testRemove() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(1);
        dynamicArray.add(2);
        int removedElement = dynamicArray.remove(0);
        assertEquals(1, removedElement);
        assertEquals(1, dynamicArray.getSize());
    }

    @Test
    void testIsEmpty() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        assertTrue(dynamicArray.isEmpty());
        dynamicArray.add("Test");
        assertTrue(!dynamicArray.isEmpty());
    }

    @Test
    void testStream() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(1);
        dynamicArray.add(2);
        assertThat(dynamicArray.stream().count()).isEqualTo(2);
    }

    @Test
    void testIterator() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("One");
        dynamicArray.add("Two");
        int count = 0;
        for (String element : dynamicArray) {
            count++;
        }
        assertEquals(2, count);
    }
}
