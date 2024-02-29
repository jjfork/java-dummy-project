package org.example.datastructures.dynamicarray;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DynamicArrayTests {

    @Test
    public void testAdd() {
        // Arrange
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        
        // Act
        dynamicArray.add(5);
        
        // Assert
        assertThat(dynamicArray.getSize()).isEqualTo(1);
    }

    @Test
    public void testPut() {
        // Arrange
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("Hello");
        
        // Act
        dynamicArray.put(0, "World");
        
        // Assert
        assertThat(dynamicArray.get(0)).isEqualTo("World");
    }

    @Test
    public void testRemove() {
        // Arrange
        DynamicArray<Double> dynamicArray = new DynamicArray<>();
        dynamicArray.add(3.14);
        
        // Act
        Double removedElement = dynamicArray.remove(0);
        
        // Assert
        assertThat(removedElement).isEqualTo(3.14);
        assertThat(dynamicArray.getSize()).isZero();
    }

    @Test
    public void testStream() {
        // Arrange
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        
        // Act
        long count = dynamicArray.stream().count();
        
        // Assert
        assertThat(count).isEqualTo(3);
    }

    // Add more tests for other methods as needed
}