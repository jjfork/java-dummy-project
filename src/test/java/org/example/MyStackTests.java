package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyStackTests {

    @Test
    public void testPush() {
        MyStack myStack = new MyStack();
        Object item = new Object();
        myStack.push(item);
        assert myStack.peek().equals(item);
    }

    @Test
    public void testPop() {
        MyStack myStack = new MyStack();
        Object item = new Object();
        myStack.push(item);
        assert myStack.pop().equals(item);
    }

    @Test
    public void testPeek() {
        MyStack myStack = new MyStack();
        Object item = new Object();
        myStack.push(item);
        assert myStack.peek().equals(item);
    }

    @Test
    public void testIsEmpty() {
        MyStack myStack = new MyStack();
        assert myStack.isEmpty();
    }
}