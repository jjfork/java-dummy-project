package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyArrayListTests {

    @InjectMocks
    private MyArrayList<String> myArrayList;

    @Test
    public void testAdd() {
        myArrayList.add("element1");
        assertThat(myArrayList.get(0)).isEqualTo("element1");
    }

    @Test
    public void testGet() {
        myArrayList.add("element1");
        myArrayList.add("element2");
        assertThat(myArrayList.get(1)).isEqualTo("element2");
    }

    @Test
    public void testIncreaseCapacity() {
        for (int i = 0; i < 11; i++) {
            myArrayList.add("element" + i);
        }
        assertThat(myArrayList.get(10)).isEqualTo("element10");
    }
}