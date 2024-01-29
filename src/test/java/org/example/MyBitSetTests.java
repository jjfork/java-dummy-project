package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyBitSetTests {

    @Test
    public void testSet() {
        // Arrange
        MyBitSet myBitSet = new MyBitSet();

        // Act
        myBitSet.set(5);

        // Assert
        assertThat(myBitSet.get(5)).isTrue();
    }

    @Test
    public void testClear() {
        // Arrange
        MyBitSet myBitSet = new MyBitSet();
        myBitSet.set(10);

        // Act
        myBitSet.clear(10);

        // Assert
        assertThat(myBitSet.get(10)).isFalse();
    }

    @Test
    public void testGet() {
        // Arrange
        MyBitSet myBitSet = new MyBitSet();
        myBitSet.set(15);

        // Act
        boolean result = myBitSet.get(15);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testFlip() {
        // Arrange
        MyBitSet myBitSet = new MyBitSet();

        // Act
        myBitSet.flip(20);

        // Assert
        assertThat(myBitSet.get(20)).isTrue();
    }

    @Test
    public void testCardinality() {
        // Arrange
        MyBitSet myBitSet = new MyBitSet();
        myBitSet.set(25);
        myBitSet.set(30);

        // Act
        int result = myBitSet.cardinality();

        // Assert
        assertThat(result).isEqualTo(2);
    }

    // Add more tests for and, or, xor, andNot methods
}