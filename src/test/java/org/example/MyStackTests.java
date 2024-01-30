package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class MyStackTests {

    @Test
    public void testPush() {
        // Given
        MyStack myStack = new MyStack();

        // When
        myStack.push("Test");

        // Then
        assertThat(myStack.peek()).isEqualTo("Test");
    }

    @Test
    public void testPop() {
        // Given
        MyStack myStack = new MyStack();
        myStack.push("Test");

        // When
        Object result = myStack.pop();

        // Then
        assertThat(result).isEqualTo("Test");
        assertThat(myStack.isEmpty()).isTrue();
    }

    @Test
    public void testPeek() {
        // Given
        MyStack myStack = new MyStack();
        myStack.push("Test");

        // When
        Object result = myStack.peek();

        // Then
        assertThat(result).isEqualTo("Test");
        assertThat(myStack.isEmpty()).isFalse();
    }

    @Test
    public void testIsEmpty() {
        // Given
        MyStack myStack = new MyStack();

        // Then
        assertThat(myStack.isEmpty()).isTrue();
    }
}