package org.example.datastructures.dynamicarray;

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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DynamicArrayTests {

    @Test
    void testAdd() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(1);
        dynamicArray.add(2);

        assertThat(dynamicArray.getSize()).isEqualTo(2);
    }

    @Test
    void testPut() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.put(0, "Hello");

        assertThat(dynamicArray.get(0)).isEqualTo("Hello");
    }

    @Test
    void testRemove() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("One");
        dynamicArray.add("Two");

        String removedElement = dynamicArray.remove(1);

        assertThat(removedElement).isEqualTo("Two");
        assertThat(dynamicArray.getSize()).isEqualTo(1);
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
        dynamicArray.add("First");
        dynamicArray.add("Second");

        int count = 0;
        for (String element : dynamicArray) {
            count++;
        }

        assertThat(count).isEqualTo(2);
    }
}
