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
    public void testPfactorsWithZero() {
        List<Integer> result = PrimeFactorization.pfactors(0);
        assertThat(result).isEmpty();
    }

    @Test
    public void testPfactorsWithEvenNumber() {
        List<Integer> result = PrimeFactorization.pfactors(24);
        assertThat(result).isEqualTo(Arrays.asList(2, 2, 2, 3));
    }

    @Test
    public void testPfactorsWithOddNumber() {
        List<Integer> result = PrimeFactorization.pfactors(21);
        assertThat(result).isEqualTo(Arrays.asList(3, 7));
    }

    @Test
    public void testPfactorsWithPrimeNumber() {
        List<Integer> result = PrimeFactorization.pfactors(17);
        assertThat(result).isEqualTo(Arrays.asList(17));
    }
}