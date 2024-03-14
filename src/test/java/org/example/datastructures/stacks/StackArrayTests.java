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
        int value = stack.pop();

        // Assert
        assertThat(value).isEqualTo(10);
        assertThat(stack.size()).isZero();
    }

    @Test
    public void testPeek() {
        // Arrange
        StackArray stack = new StackArray(5);
        stack.push(10);

        // Act
        int value = stack.peek();

        // Assert
        assertThat(value).isEqualTo(10);
        assertThat(stack.size()).isEqualTo(1);
    }

    @Test
    public void testIsEmpty() {
        // Arrange
        StackArray stack = new StackArray(5);

        // Act
        boolean empty = stack.isEmpty();

        // Assert
        assertThat(empty).isTrue();
    }

    @Test
    public void testIsFull() {
        // Arrange
        StackArray stack = new StackArray(2);
        stack.push(10);
        stack.push(20);

        // Act
        boolean full = stack.isFull();

        // Assert
        assertThat(full).isTrue();
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
        int size = stack.size();

        // Assert
        assertThat(size).isEqualTo(2);
    }
}