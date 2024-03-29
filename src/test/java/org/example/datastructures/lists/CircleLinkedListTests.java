package org.example.datastructures.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

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
        assertThat(circleLinkedList.getSize()).isEqualTo(1);
    }

    @Test
    public void testRemove() {
        circleLinkedList.append(5);
        circleLinkedList.append(10);
        circleLinkedList.append(15);
        assertThat(circleLinkedList.remove(1)).isEqualTo(10);
        assertThat(circleLinkedList.getSize()).isEqualTo(2);
    }

    @Test
    public void testToString() {
        circleLinkedList.append(5);
        circleLinkedList.append(10);
        circleLinkedList.append(15);
        assertThat(circleLinkedList.toString()).isEqualTo("[ 5 , 10 , 15 ]");
    }
}