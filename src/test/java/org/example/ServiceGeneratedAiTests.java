package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int number = 4;
        // WHEN the isEven method is called with the number
        boolean result = service.isEven(number);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int number = 7;
        // WHEN the isEven method is called with the number
        boolean result = service.isEven(number);
        // THEN the result should be false
        assertFalse(result);
    }

    @Test
    void testHighComplexityMethod_GivenAllPositive() {
        // GIVEN a, b, and c are all positive
        int a = 1;
        int b = 2;
        int c = 3;
        // WHEN highComplexityMethod is called with the inputs
        service.highComplexityMethod(a, b, c);
        // THEN the output should be: "a is positive", "b is positive", "c is positive"
    }

    @Test
    void testHighComplexityMethod_GivenAllNonPositive() {
        // GIVEN a, b, and c are all non-positive
        int a = -1;
        int b = -2;
        int c = -3;
        // WHEN highComplexityMethod is called with the inputs
        service.highComplexityMethod(a, b, c);
        // THEN the output should be: "a is non-positive", "b is non-positive", "c is non-positive"
    }

    @Test
    void testHighComplexityMethod_GivenANonPositive() {
        // GIVEN a is non-positive, b and c are positive
        int a = -1;
        int b = 2;
        int c = 3;
        // WHEN highComplexityMethod is called with the inputs
        service.highComplexityMethod(a, b, c);
        // THEN the output should be: "a is non-positive", "b is positive", "c is positive"
    }

    @Test
    void testHighComplexityMethod_GivenAPositive() {
        // GIVEN a is positive, b and c are non-positive
        int a = 1;
        int b = -2;
        int c = 0;
        // WHEN highComplexityMethod is called with the inputs
        service.highComplexityMethod(a, b, c);
        // THEN the output should be: "a is positive", "b is non-positive", "c is non-positive"
    }



}
