package org.example.datastructures.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CircleLinkedListTests {

    private CircleLinkedList<Integer> circleLinkedList;

    @BeforeEach
    public void setUp() {
        circleLinkedList = new CircleLinkedList<>();
    }

    @Test
    public void testAppend() {
        circleLinkedList.append(5);
        circleLinkedList.append(10);
        assertEquals(2, circleLinkedList.getSize());
    }

    @Test
    public void testRemove() {
        circleLinkedList.append(5);
        circleLinkedList.append(10);
        circleLinkedList.append(15);
        int removed = circleLinkedList.remove(1);
        assertEquals(10, removed);
        assertEquals(2, circleLinkedList.getSize());
    }

    @Test
    public void testToString() {
        circleLinkedList.append(5);
        circleLinkedList.append(10);
        circleLinkedList.append(15);
        String expected = "[ 5 , 10 , 15 ]";
        assertEquals(expected, circleLinkedList.toString());
    }
}