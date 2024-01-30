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
        // Given
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        
        // When
        myArrayList.add(5);
        
        // Then
        assertThat(myArrayList.get(0)).isEqualTo(5);
    }

    @Test
    public void testGet() {
        // Given
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Hello");
        
        // When
        String result = myArrayList.get(0);
        
        // Then
        assertThat(result).isEqualTo("Hello");
    }

    @Test
    public void testIncreaseCapacity() {
        // Given
        MyArrayList<Double> myArrayList = new MyArrayList<>();
        
        // When
        for (int i = 0; i < 15; i++) {
            myArrayList.add(3.14);
        }
        
        // Then
        assertThat(myArrayList.get(14)).isEqualTo(3.14);
    }
}