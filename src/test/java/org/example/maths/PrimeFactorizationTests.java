package org.example.maths;

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

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(result).containsExactly(2, 2, 2, 3);
    }

    @Test
    public void testPfactorsWithOddNumber() {
        List<Integer> result = PrimeFactorization.pfactors(21);
        assertThat(result).containsExactly(3, 7);
    }

    @Test
    public void testPfactorsWithPrimeNumber() {
        List<Integer> result = PrimeFactorization.pfactors(17);
        assertThat(result).containsExactly(17);
    }
}
