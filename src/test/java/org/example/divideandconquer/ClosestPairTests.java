package org.example.divideandconquer;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class ClosestPairTests {

    @Test
    public void testClosestPair() {
        // Test logic here
        ClosestPair closestPair = new ClosestPair(5);
        ClosestPair.Location[] locations = closestPair.createLocation(5);
        locations[0] = closestPair.buildLocation(1.0, 2.0);
        locations[1] = closestPair.buildLocation(3.0, 4.0);
        locations[2] = closestPair.buildLocation(5.0, 6.0);
        locations[3] = closestPair.buildLocation(7.0, 8.0);
        locations[4] = closestPair.buildLocation(9.0, 10.0);

        double result = closestPair.closestPair(locations, 5);

        assertThat(result).isNotNull();
    }

    @Test
    public void testBruteForce() {
        // Test logic here
        ClosestPair closestPair = new ClosestPair(3);
        ClosestPair.Location[] locations = closestPair.createLocation(3);
        locations[0] = closestPair.buildLocation(1.0, 2.0);
        locations[1] = closestPair.buildLocation(3.0, 4.0);
        locations[2] = closestPair.buildLocation(5.0, 6.0);

        double result = closestPair.bruteForce(locations);

        assertThat(result).isNotNull();
    }

}
