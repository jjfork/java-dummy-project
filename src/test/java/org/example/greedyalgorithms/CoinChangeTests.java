package org.example.greedyalgorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.Arrays;

@ExtendWith(MockitoExtension.class)
public class CoinChangeTests {

    @Test
    public void testCoinChangeProblem() {
        // Given
        int amount = 30;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(20, 10));

        // When
        ArrayList<Integer> result = CoinChange.coinChangeProblem(amount);

        // Then
        assertThat(result).isNotNull();
        assertThat(result).isEqualTo(expected);
    }
}