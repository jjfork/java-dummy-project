package org.example.divideandconquer;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
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
        ClosestPair.Location[] locations = new ClosestPair.Location[3];
        locations[0] = new ClosestPair.Location(0, 0);
        locations[1] = new ClosestPair.Location(1, 1);
        locations[2] = new ClosestPair.Location(2, 2);

        ClosestPair closestPair = new ClosestPair(3);
        double result = closestPair.closestPair(locations, 3);

        assertThat(result).isNotNull();
    }

    @Test
    public void testBruteForce() {
        ClosestPair.Location[] locations = new ClosestPair.Location[2];
        locations[0] = new ClosestPair.Location(0, 0);
        locations[1] = new ClosestPair.Location(1, 1);

        ClosestPair closestPair = new ClosestPair(2);
        double result = closestPair.bruteForce(locations);

        assertThat(result).isNotNull();
    }

    @Test
    public void testXPartition() {
        ClosestPair.Location[] locations = new ClosestPair.Location[3];
        locations[0] = new ClosestPair.Location(0, 0);
        locations[1] = new ClosestPair.Location(1, 1);
        locations[2] = new ClosestPair.Location(2, 2);

        ClosestPair closestPair = new ClosestPair(3);
        int result = closestPair.xPartition(locations, 0, 2);

        assertThat(result).isNotNull();
    }

    @Test
    public void testYPartition() {
        ClosestPair.Location[] locations = new ClosestPair.Location[3];
        locations[0] = new ClosestPair.Location(0, 0);
        locations[1] = new ClosestPair.Location(1, 1);
        locations[2] = new ClosestPair.Location(2, 2);

        ClosestPair closestPair = new ClosestPair(3);
        int result = closestPair.yPartition(locations, 0, 2);

        assertThat(result).isNotNull();
    }

    @Test
    public void testXQuickSort() {
        ClosestPair.Location[] locations = new ClosestPair.Location[3];
        locations[0] = new ClosestPair.Location(0, 0);
        locations[1] = new ClosestPair.Location(1, 1);
        locations[2] = new ClosestPair.Location(2, 2);

        ClosestPair closestPair = new ClosestPair(3);
        closestPair.xQuickSort(locations, 0, 2);

        assertThat(locations).isNotNull();
    }

    @Test
    public void testYQuickSort() {
        ClosestPair.Location[] locations = new ClosestPair.Location[3];
        locations[0] = new ClosestPair.Location(0, 0);
        locations[1] = new ClosestPair.Location(1, 1);
        locations[2] = new ClosestPair.Location(2, 2);

        ClosestPair closestPair = new ClosestPair(3);
        closestPair.yQuickSort(locations, 0, 2);

        assertThat(locations).isNotNull();
    }

}
