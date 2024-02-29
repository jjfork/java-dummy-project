package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CombinationsTests {

    @Test
    public void testFactorial() {
        // Test case for factorial method
        assertThat(Combinations.factorial(5)).isEqualTo(120);
    }

    @Test
    public void testCombinations() {
        // Test case for combinations method
        assertThat(Combinations.combinations(5, 2)).isEqualTo(10);
    }

    @Test
    public void testCombinationsOptimized() {
        // Test case for combinationsOptimized method
        assertThat(Combinations.combinationsOptimized(5, 2)).isEqualTo(10);
    }
}