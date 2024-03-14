package org.example.datastructures.bags;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BagTests {

    @Test
    public void testIsEmpty() {
        Bag<String> bag = new Bag<>();
        assertThat(bag.isEmpty()).isTrue();
    }

    @Test
    public void testSize() {
        Bag<Integer> bag = new Bag<>();
        bag.add(5);
        bag.add(10);
        assertThat(bag.size()).isEqualTo(2);
    }

    @Test
    public void testAdd() {
        Bag<Integer> bag = new Bag<>();
        bag.add(5);
        assertThat(bag.size()).isEqualTo(1);
    }

    @Test
    public void testContains() {
        Bag<String> bag = new Bag<>();
        bag.add("apple");
        bag.add("banana");
        assertThat(bag.contains("apple")).isTrue();
        assertThat(bag.contains("orange")).isFalse();
    }

    @Test
    public void testIterator() {
        Bag<Integer> bag = new Bag<>();
        bag.add(1);
        bag.add(2);
        bag.add(3);
        int sum = 0;
        for (int value : bag) {
            sum += value;
        }
        assertThat(sum).isEqualTo(6);
    }
}