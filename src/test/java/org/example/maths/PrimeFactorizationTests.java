package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PrimeFactorizationTests {

    @Test
    public void pfactors_WithZero_ReturnsEmptyList() {
        int n = 0;
        List<Integer> result = PrimeFactorization.pfactors(n);
        assertThat(result).isEmpty();
    }

    @Test
    public void pfactors_WithNonZero_ReturnsPrimeFactors() {
        int n = 30;
        List<Integer> result = PrimeFactorization.pfactors(n);
        assertThat(result).isEqualTo(Arrays.asList(2, 3, 5));
    }

    @Test
    public void pfactors_WithLargeNumber_ReturnsPrimeFactors() {
        int n = 315;
        List<Integer> result = PrimeFactorization.pfactors(n);
        assertThat(result).isEqualTo(Arrays.asList(3, 3, 5, 7));
    }
}