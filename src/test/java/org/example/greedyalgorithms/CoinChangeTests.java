package org.example.greedyalgorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)
public class CoinChangeTests {

    @Test
    public void testCoinChangeProblem() {
        // Given
        int amount = 30;
        
        // When
        ArrayList<Integer> result = CoinChange.coinChangeProblem(amount);
        
        // Then
        assertThat(result).isNotNull();
        assertThat(result).containsExactly(20, 10);
    }
}