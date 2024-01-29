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
        MyArrayList<Integer> list = new MyArrayList<>();
        
        // When
        list.add(5);
        
        // Then
        assertThat(list.get(0)).isEqualTo(5);
    }

    @Test
    public void testGet() {
        // Given
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        
        // When
        String result = list.get(0);
        
        // Then
        assertThat(result).isEqualTo("Hello");
    }

    @Test
    public void testIncreaseCapacity() {
        // Given
        MyArrayList<Integer> list = new MyArrayList<>();
        
        // When
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        
        // Then
        assertThat(list.get(14)).isEqualTo(14);
    }
}