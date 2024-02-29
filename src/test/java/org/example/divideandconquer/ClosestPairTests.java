package org.example.divideandconquer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ClosestPairTests {

    @Test
    public void testClosestPair() {
        // Arrange
        ClosestPair.Location[] locations = new ClosestPair.Location[3];
        locations[0] = new ClosestPair.Location(1.0, 2.0);
        locations[1] = new ClosestPair.Location(3.0, 4.0);
        locations[2] = new ClosestPair.Location(5.0, 6.0);
        
        ClosestPair closestPair = new ClosestPair(3);
        
        // Act
        double result = closestPair.closestPair(locations, 3);
        
        // Assert
        // Add assertions using AssertJ or JUnit assertions
    }

    @Test
    public void testBruteForce() {
        // Arrange
        ClosestPair.Location[] locations = new ClosestPair.Location[2];
        locations[0] = new ClosestPair.Location(1.0, 2.0);
        locations[1] = new ClosestPair.Location(3.0, 4.0);
        
        ClosestPair closestPair = new ClosestPair(2);
        
        // Act
        double result = closestPair.bruteForce(locations);
        
        // Assert
        // Add assertions using AssertJ or JUnit assertions
    }
}