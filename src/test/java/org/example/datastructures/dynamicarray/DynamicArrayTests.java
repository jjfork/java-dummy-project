package org.example.datastructures.dynamicarray;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

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
        assertThat(dynamicArray.getSize()).isEqualTo(1);
    }

    @Test
    void testPut() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.put(0, "test");
        assertThat(dynamicArray.get(0)).isEqualTo("test");
    }

    @Test
    void testRemove() {
        DynamicArray<Double> dynamicArray = new DynamicArray<>();
        dynamicArray.add(2.5);
        dynamicArray.add(3.7);
        dynamicArray.remove(0);
        assertThat(dynamicArray.getSize()).isEqualTo(1);
    }

    @Test
    void testIsEmpty() {
        DynamicArray<Boolean> dynamicArray = new DynamicArray<>();
        assertThat(dynamicArray.isEmpty()).isTrue();
        dynamicArray.add(true);
        assertThat(dynamicArray.isEmpty()).isFalse();
    }

    @Test
    void testIterator() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);

        int sum = 0;
        for (Integer element : dynamicArray) {
            sum += element;
        }

        assertThat(sum).isEqualTo(6);
    }

    @Test
    void testStream() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("hello");
        dynamicArray.add("world");

        long count = dynamicArray.stream().count();
        assertThat(count).isEqualTo(2);
    }
}
