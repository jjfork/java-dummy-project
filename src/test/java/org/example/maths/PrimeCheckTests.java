package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PrimeCheckTests {

    @Test
    void testIsPrime() {
        assertTrue(PrimeCheck.isPrime(2));
        assertTrue(PrimeCheck.isPrime(3));
        assertTrue(PrimeCheck.isPrime(5));
        assertTrue(PrimeCheck.isPrime(7));
        assertFalse(PrimeCheck.isPrime(4));
        assertFalse(PrimeCheck.isPrime(6));
        assertFalse(PrimeCheck.isPrime(9));
    }

    @Test
    void testFermatPrimeChecking() {
        assertTrue(PrimeCheck.fermatPrimeChecking(2, 5));
        assertTrue(PrimeCheck.fermatPrimeChecking(3, 5));
        assertTrue(PrimeCheck.fermatPrimeChecking(5, 5));
        assertTrue(PrimeCheck.fermatPrimeChecking(7, 5));
        assertFalse(PrimeCheck.fermatPrimeChecking(4, 5));
        assertFalse(PrimeCheck.fermatPrimeChecking(6, 5));
        assertFalse(PrimeCheck.fermatPrimeChecking(9, 5));
    }
}