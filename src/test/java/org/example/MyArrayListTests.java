package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyArrayListTests {

    MyArrayList<Integer> myArrayList;

    @BeforeEach
    public void setUp() {
        myArrayList = new MyArrayList<>();
    }

    @Test
    public void testAdd() {
        myArrayList.add(5);
        assertEquals(1, myArrayList.size());
    }

    @Test
    public void testGet() {
        myArrayList.add(10);
        assertEquals(10, myArrayList.get(0));
    }

    @Test
    public void testGet_IndexOutOfBoundsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> myArrayList.get(1));
    }

    @Test
    public void testIncreaseCapacity() {
        MyArrayList<Integer> spyList = spy(myArrayList);
        doNothing().when(spyList).increaseCapacity();
        for (int i = 0; i < 11; i++) {
            spyList.add(i);
        }
        verify(spyList, times(2)).increaseCapacity();
    }
}