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

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class SumOfArithmeticSeriesTests {

    @Test
    public void testSumOfSeries_withPositiveNumOfTerms() {
        double firstTerm = 1.0;
        double commonDiff = 2.0;
        int numOfTerms = 5;

        double expectedSum = 25.0;
        double actualSum = SumOfArithmeticSeries.sumOfSeries(firstTerm, commonDiff, numOfTerms);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumOfSeries_withZeroNumOfTerms() {
        double firstTerm = 1.0;
        double commonDiff = 2.0;
        int numOfTerms = 0;

        double expectedSum = 0.0;
        double actualSum = SumOfArithmeticSeries.sumOfSeries(firstTerm, commonDiff, numOfTerms);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumOfSeries_withNegativeNumOfTerms() {
        double firstTerm = 1.0;
        double commonDiff = 2.0;
        int numOfTerms = -5;

        IllegalArgumentException exception = null;
        try {
            SumOfArithmeticSeries.sumOfSeries(firstTerm, commonDiff, numOfTerms);
        } catch (IllegalArgumentException e) {
            exception = e;
        }

        assertThat(exception).isNotNull();
    }
}
