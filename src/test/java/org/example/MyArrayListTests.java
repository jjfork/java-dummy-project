package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class MyArrayListTests {

    private MyArrayList<Integer> myArrayList = new MyArrayList<>();

    @Test
    public void testAdd() {
        myArrayList.add(5);
        myArrayList.add(10);
        assertEquals(5, myArrayList.get(0));
        assertEquals(10, myArrayList.get(1));
    }

    @Test
    public void testGet() {
        myArrayList.add(15);
        myArrayList.add(20);
        assertEquals(15, myArrayList.get(0));
        assertEquals(20, myArrayList.get(1));
    }

    @Test
    public void testIncreaseCapacity() {
        for (int i = 0; i < 15; i++) {
            myArrayList.add(i);
        }
        assertEquals(14, myArrayList.get(14));
    }
}