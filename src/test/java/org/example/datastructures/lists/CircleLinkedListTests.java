package org.example.datastructures.lists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CircleLinkedListTests {

    @Test
    public void testAppend() {
        CircleLinkedList<Integer> list = new CircleLinkedList<>();
        list.append(1);
        list.append(2);
        assertThat(list.getSize()).isEqualTo(2);
    }

    @Test
    public void testRemove() {
        CircleLinkedList<String> list = new CircleLinkedList<>();
        list.append("a");
        list.append("b");
        list.append("c");
        String removed = list.remove(1);
        assertThat(removed).isEqualTo("b");
        assertThat(list.getSize()).isEqualTo(2);
    }
}