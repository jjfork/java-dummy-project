package org.example.datastructures.stacks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StackArrayTests {

    @Test
    public void testPush() {
        // Arrange
        StackArray stack = new StackArray(5);

        // Act
        stack.push(10);

        // Assert
        assertThat(stack.size()).isEqualTo(1);
    }

    @Test
    public void testPop() {
        // Arrange
        StackArray stack = new StackArray(5);
        stack.push(10);

        // Act
        int result = stack.pop();

        // Assert
        assertThat(result).isEqualTo(10);
        assertThat(stack.size()).isZero();
    }

    @Test
    public void testPeek() {
        // Arrange
        StackArray stack = new StackArray(5);
        stack.push(10);

        // Act
        int result = stack.peek();

        // Assert
        assertThat(result).isEqualTo(10);
        assertThat(stack.size()).isEqualTo(1);
    }

    @Test
    public void testIsEmpty() {
        // Arrange
        StackArray stack = new StackArray(5);

        // Act
        boolean result = stack.isEmpty();

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testIsFull() {
        // Arrange
        StackArray stack = new StackArray(2);
        stack.push(10);
        stack.push(20);

        // Act
        boolean result = stack.isFull();

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testMakeEmpty() {
        // Arrange
        StackArray stack = new StackArray(5);
        stack.push(10);

        // Act
        stack.makeEmpty();

        // Assert
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    public void testSize() {
        // Arrange
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);

        // Act
        int result = stack.size();

        // Assert
        assertThat(result).isEqualTo(2);
    }
}