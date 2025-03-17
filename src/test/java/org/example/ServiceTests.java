package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_EvenNumber() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void testIsEven_OddNumber() {
        // GIVEN an odd number
        int input = 7;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be false
        assertFalse(result);
    }

    @Test
    void testHighComplexityMethod_AllPositive() {
        // GIVEN a, b, and c are positive
        int a = 1;
        int b = 2;
        int c = 3;
        // WHEN highComplexityMethod is called
        service.highComplexityMethod(a, b, c);
        // THEN the expected output is printed
        // (This test relies on the method's output being printed to console)
    }

    @Test
    void testHighComplexityMethod_APositiveBNonPositiveCPositive() {
        // GIVEN a is positive, b is non-positive, and c is positive
        int a = 1;
        int b = -2;
        int c = 3;
        // WHEN highComplexityMethod is called
        service.highComplexityMethod(a, b, c);
        // THEN the expected output is printed
        // (This test relies on the method's output being printed to console)
    }

    @Test
    void testHighComplexityMethod_APositiveBPositiveCNonPositive() {
        // GIVEN a is positive, b is positive, and c is non-positive
        int a = 1;
        int b = 2;
        int c = -3;
        // WHEN highComplexityMethod is called
        service.highComplexityMethod(a, b, c);
        // THEN the expected output is printed
        // (This test relies on the method's output being printed to console)
    }

    @Test
    void testHighComplexityMethod_ANonPositiveBNonPositiveCNonPositive() {
        // GIVEN a is non-positive, b is non-positive, and c is non-positive
        int a = -1;
        int b = -2;
        int c = -3;
        // WHEN highComplexityMethod is called
        service.highComplexityMethod(a, b, c);
        // THEN the expected output is printed
        // (This test relies on the method's output being printed to console)
    }

}
