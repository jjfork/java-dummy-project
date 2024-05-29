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
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinomialCoefficientTests {

    @Test
    public void testBinomialCoefficient() {
        assertEquals(1, BinomialCoefficient.binomialCoefficient(5, 0));
        assertEquals(5, BinomialCoefficient.binomialCoefficient(5, 1));
        assertEquals(10, BinomialCoefficient.binomialCoefficient(5, 2));
        assertEquals(10, BinomialCoefficient.binomialCoefficient(5, 3));
        assertEquals(5, BinomialCoefficient.binomialCoefficient(5, 4));
        assertEquals(1, BinomialCoefficient.binomialCoefficient(5, 5));
    }
}
