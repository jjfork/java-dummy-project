package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyBitSetTests {

    @Test
    public void testSet() {
        MyBitSet myBitSet = new MyBitSet();
        myBitSet.set(5);
        assert(myBitSet.get(5));
    }

    @Test
    public void testClear() {
        MyBitSet myBitSet = new MyBitSet();
        myBitSet.set(10);
        myBitSet.clear(10);
        assert(!myBitSet.get(10));
    }

    @Test
    public void testGet() {
        MyBitSet myBitSet = new MyBitSet();
        myBitSet.set(15);
        assert(myBitSet.get(15));
    }

    @Test
    public void testFlip() {
        MyBitSet myBitSet = new MyBitSet();
        myBitSet.flip(20);
        assert(myBitSet.get(20));
    }

    @Test
    public void testCardinality() {
        MyBitSet myBitSet = new MyBitSet();
        myBitSet.set(25);
        assert(myBitSet.cardinality() == 1);
    }

    @Test
    public void testAnd() {
        MyBitSet myBitSet1 = new MyBitSet();
        MyBitSet myBitSet2 = new MyBitSet();
        myBitSet1.set(30);
        myBitSet2.set(30);
        myBitSet1.and(myBitSet2);
        assert(myBitSet1.get(30));
    }

    @Test
    public void testOr() {
        MyBitSet myBitSet1 = new MyBitSet();
        MyBitSet myBitSet2 = new MyBitSet();
        myBitSet1.set(35);
        myBitSet2.set(35);
        myBitSet1.or(myBitSet2);
        assert(myBitSet1.get(35));
    }

    @Test
    public void testXor() {
        MyBitSet myBitSet1 = new MyBitSet();
        MyBitSet myBitSet2 = new MyBitSet();
        myBitSet1.set(40);
        myBitSet2.set(40);
        myBitSet1.xor(myBitSet2);
    }
}