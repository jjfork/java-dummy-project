package org.example.datastructures.lists;

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
public class CircleLinkedListTests {

    @Test
    public void testAppend() {
        CircleLinkedList<Integer> list = new CircleLinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);

        assertThat(list.getSize()).isEqualTo(3);
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

    @Test
    public void testToString() {
        CircleLinkedList<String> list = new CircleLinkedList<>();
        list.append("hello");
        list.append("world");

        assertThat(list.toString()).isEqualTo("[ hello , world ]");
    }
}
