package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PerfectCubeTests {

    @Test
    public void testIsPerfectCube() {
        // Arrange
        int number = 27;

        // Act
        boolean result = PerfectCube.isPerfectCube(number);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsPerfectCubeMathCbrt() {
        // Arrange
        int number = 64;

        // Act
        boolean result = PerfectCube.isPerfectCubeMathCbrt(number);

        // Assert
        assertTrue(result);
    }
}