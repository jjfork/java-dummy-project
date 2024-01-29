package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyStackTests {

    @Test
    public void testPush() {
        // Arrange
        MyStack stack = new MyStack();

        // Act
        stack.push("item");

        // Assert
        // Use ASSERTJ for assertions
    }

    @Test
    public void testPop() {
        // Arrange
        MyStack stack = new MyStack();
        stack.push("item");

        // Act
        Object result = stack.pop();

        // Assert
        // Use ASSERTJ for assertions
    }

    @Test
    public void testPeek() {
        // Arrange
        MyStack stack = new MyStack();
        stack.push("item");

        // Act
        Object result = stack.peek();

        // Assert
        // Use ASSERTJ for assertions
    }

    @Test
    public void testIsEmpty() {
        // Arrange
        MyStack stack = new MyStack();

        // Act
        boolean result = stack.isEmpty();

        // Assert
        // Use ASSERTJ for assertions
    }
}