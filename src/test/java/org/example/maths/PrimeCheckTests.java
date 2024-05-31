package org.example.maths;

import static org.assertj.core.api.Assertions.assertThat;
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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
public class PrimeCheckTests {

    @Test
    public void testIsPrime() {
        assertTrue(PrimeCheck.isPrime(2));
        assertTrue(PrimeCheck.isPrime(3));
        assertTrue(PrimeCheck.isPrime(5));
        assertTrue(PrimeCheck.isPrime(7));
        assertFalse(PrimeCheck.isPrime(4));
        assertFalse(PrimeCheck.isPrime(6));
        assertFalse(PrimeCheck.isPrime(9));
    }

    @Test
    public void testFermatPrimeChecking() {
        assertTrue(PrimeCheck.fermatPrimeChecking(2, 1));
        assertTrue(PrimeCheck.fermatPrimeChecking(3, 1));
        assertTrue(PrimeCheck.fermatPrimeChecking(5, 1));
        assertTrue(PrimeCheck.fermatPrimeChecking(7, 1));
        assertFalse(PrimeCheck.fermatPrimeChecking(4, 1));
        assertFalse(PrimeCheck.fermatPrimeChecking(6, 1));
        assertFalse(PrimeCheck.fermatPrimeChecking(9, 1));
    }
}
