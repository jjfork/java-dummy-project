package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyBitSetTests {

    @Test
    public void testSet() {
        MyBitSet myBitSet = new MyBitSet();
        myBitSet.set(5);
        assertTrue(myBitSet.get(5));
    }

    @Test
    public void testClear() {
        MyBitSet myBitSet = new MyBitSet();
        myBitSet.set(5);
        myBitSet.clear(5);
        assertFalse(myBitSet.get(5));
    }

    @Test
    public void testGet() {
        MyBitSet myBitSet = new MyBitSet();
        myBitSet.set(5);
        assertTrue(myBitSet.get(5));
    }

    @Test
    public void testFlip() {
        MyBitSet myBitSet = new MyBitSet();
        myBitSet.flip(5);
        assertTrue(myBitSet.get(5));
        myBitSet.flip(5);
        assertFalse(myBitSet.get(5));
    }

    @Test
    public void testCardinality() {
        MyBitSet myBitSet = new MyBitSet();
        myBitSet.set(5);
        myBitSet.set(10);
        assertEquals(2, myBitSet.cardinality());
    }

    @Test
    public void testAnd() {
        MyBitSet myBitSet1 = new MyBitSet();
        myBitSet1.set(5);
        MyBitSet myBitSet2 = new MyBitSet();
        myBitSet2.set(5);
        myBitSet1.and(myBitSet2);
        assertTrue(myBitSet1.get(5));
    }

    @Test
    public void testOr() {
        MyBitSet myBitSet1 = new MyBitSet();
        myBitSet1.set(5);
        MyBitSet myBitSet2 = new MyBitSet();
        myBitSet2.set(10);
        myBitSet1.or(myBitSet2);
        assertTrue(myBitSet1.get(5));
        assertTrue(myBitSet1.get(10));
    }

    @Test
    public void testXor() {
        MyBitSet myBitSet1 = new MyBitSet();
        myBitSet1.set(