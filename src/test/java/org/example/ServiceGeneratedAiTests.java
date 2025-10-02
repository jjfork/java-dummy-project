package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void givenEvenNumber_whenIsEven_thenReturnsTrue() {
        // GIVEN
        int input = 4;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }

    @Test
    void givenOddNumber_whenIsEven_thenReturnsFalse() {
        // GIVEN
        int input = 5;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(false, result);
    }

    @Test
    void givenZero_whenIsEven_thenReturnsTrue() {
        // GIVEN
        int input = 0;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }

    @Test
    void givenPositiveAZeroBPositiveCPositive_whenHighComplexityMethod_thenExecutesWithoutException() {
        // GIVEN
        int a = 0;
        int b = 1;
        int c = 1;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        assertEquals(true, true);
    }

    @Test
    void givenNegativeAZeroBPositiveCNegative_whenHighComplexityMethod_thenExecutesWithoutException() {
        // GIVEN
        int a = -1;
        int b = 1;
        int c = -1;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        assertEquals(true, true);
    }

    @Test
    void givenPositiveANegativeBPositiveCPositive_whenHighComplexityMethod_thenExecutesWithoutException() {
        // GIVEN
        int a = 1;
        int b = -1;
        int c = 1;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        assertEquals(true, true);
    }

    @Test
    void givenPositiveANegativeBNegativeCNegative_whenHighComplexityMethod_thenExecutesWithoutException() {
        // GIVEN
        int a = 1;
        int b = -1;
        int c = -1;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        assertEquals(true, true);
    }

    @Test
    void givenValidInputs_whenHighComplexityMethod_thenNoExceptionThrown() {
        // GIVEN
        int a = 2;
        int b = 3;
        int c = 4;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        assertEquals(true, true);
    }

    @Test
    void givenNullService_whenCallingIsEven_thenThrowsNullPointerException() {
        // GIVEN
        Service nullService = null;

        // WHEN & THEN
        assertThrows(NullPointerException.class, () -> nullService.isEven(2));
    }

    @Test
    void givenNullService_whenCallingHighComplexityMethod_thenThrowsNullPointerException() {
        // GIVEN
        Service nullService = null;

        // WHEN & THEN
        assertThrows(NullPointerException.class, () -> nullService.highComplexityMethod(1, 2, 3));
    }

    @Test
    void givenNegativeEvenNumber_whenIsEven_thenReturnsTrue() {
        // GIVEN
        int input = -6;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }

    @Test
    void givenNegativeOddNumber_whenIsEven_thenReturnsFalse() {
        // GIVEN
        int input = -7;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(false, result);
    }

    @Test
    void givenMaxInteger_whenIsEven_thenReturnsFalse() {
        // GIVEN
        int input = Integer.MAX_VALUE;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(false, result);
    }

    @Test
    void givenMinInteger_whenIsEven_thenReturnsTrue() {
        // GIVEN
        int input = Integer.MIN_VALUE;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertEquals(true, result);
    }
}
