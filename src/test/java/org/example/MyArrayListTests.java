package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyArrayListTests {

    @Test
    public void testAdd() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        assertThat(list.get(0)).isEqualTo(1);
    }

    @Test
    public void testGet() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("a");
        list.add("b");
        assertThat(list.get(1)).isEqualTo("b");
    }

    @Test
    public void testIncreaseCapacity() {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        assertThat(list.get(14)).isEqualTo(14);
    }
}