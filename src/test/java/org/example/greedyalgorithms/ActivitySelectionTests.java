package org.example.greedyalgorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)
public class ActivitySelectionTests {

    @Test
    public void testActivitySelection() {
        // Given
        int[] startTimes = {1, 3, 0, 5, 8, 5};
        int[] endTimes = {2, 4, 6, 7, 9, 9};

        // When
        ArrayList<Integer> result = ActivitySelection.activitySelection(startTimes, endTimes);

        // Then
        // Add assertions here
    }
}