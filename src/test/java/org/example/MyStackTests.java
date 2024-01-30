package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class MyStackTests {

    @Test
    public void testPush() {
        MyStack myStack = new MyStack();
        Object item = new Object();
        myStack.push(item);
        assertThat(myStack.peek()).isEqualTo(item);
    }

    @Test
    public void testPop() {
        MyStack myStack = new MyStack();
        Object item = new Object();
        myStack.push(item);
        Object poppedItem = myStack.pop();
        assertThat(poppedItem).isEqualTo(item);
        assertThat(myStack.isEmpty()).isTrue();
    }

    @Test
    public void testPeek() {
        MyStack myStack = new MyStack();
        Object item = new Object();
        myStack.push(item);
        Object peekedItem = myStack.peek();
        assertThat(peekedItem).isEqualTo(item);
        assertThat(myStack.isEmpty()).isFalse();
    }

    @Test
    public void testIsEmpty() {
        MyStack myStack = new MyStack();
        assertThat(myStack.isEmpty()).isTrue();
    }

    @Test
    public void testEnsureCapacity() {
        MyStack myStack = new MyStack();
        for (int i = 0; i < 20; i++) {
            myStack.push(new Object());
        }
        assertThat(myStack.isEmpty()).isFalse();
    }

    @Test
    public void testPopEmptyStack() {
        MyStack myStack = new MyStack();
        assertThatThrownBy(() -> myStack.pop())
                .isInstanceOf(NoSuchElementException.class)
                .hasMessage("Stack is empty");
    }

    @Test
    public void testPeekEmptyStack() {
        MyStack myStack = new MyStack();
        assertThatThrownBy(() -> myStack.peek())
                .isInstanceOf(NoSuchElementException.class)
                .hasMessage("Stack is empty");
    }
}