package org.example.datastructures.queues;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GenericArrayListQueueTests {

    @Test
    public void testPeek_WhenQueueHasElements_ThenReturnFirstElement() {
        // Arrange
        GenericArrayListQueue<Integer> queue = new GenericArrayListQueue<>();
        queue.add(1);
        queue.add(2);
        
        // Act
        Integer result = queue.peek();
        
        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testPeek_WhenQueueIsEmpty_ThenReturnNull() {
        // Arrange
        GenericArrayListQueue<String> queue = new GenericArrayListQueue<>();
        
        // Act
        String result = queue.peek();
        
        // Assert
        assertThat(result).isNull();
    }

    @Test
    public void testAdd_WhenElementAdded_ThenReturnTrue() {
        // Arrange
        GenericArrayListQueue<String> queue = new GenericArrayListQueue<>();
        
        // Act
        boolean result = queue.add("element");
        
        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testPull_WhenQueueHasElements_ThenReturnFirstElementAndRemoveIt() {
        // Arrange
        GenericArrayListQueue<Integer> queue = new GenericArrayListQueue<>();
        queue.add(1);
        queue.add(2);
        
        // Act
        Integer result = queue.pull();
        
        // Assert
        assertThat(result).isEqualTo(1);
        assertThat(queue.peek()).isEqualTo(2);
    }

    @Test
    public void testPull_WhenQueueIsEmpty_ThenReturnNull() {
        // Arrange
        GenericArrayListQueue<String> queue = new GenericArrayListQueue<>();
        
        // Act
        String result = queue.pull();
        
        // Assert
        assertThat(result).isNull();
    }
}