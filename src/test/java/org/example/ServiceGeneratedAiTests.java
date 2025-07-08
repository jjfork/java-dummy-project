package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven() {
        GIVEN int input = 4;
        WHEN boolean result = service.isEven(input);
        THEN assertTrue(result);
    }

    @Test
    void testIsEvenNegative() {
        GIVEN int input = -5;
        WHEN boolean result = service.isEven(input);
        THEN assertFalse(result);
    }

    @Test
    void testHighComplexityMethodPositive() {
        GIVEN int a = 1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is positive\nc is positive", getConsoleOutput());
    }

    @Test
    void testHighComplexityMethodNonPositiveA() {
        GIVEN int a = -1, b = 2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is non-positive\nb is positive\nc is positive", getConsoleOutput());
    }

    @Test
    void testHighComplexityMethodNonPositiveB() {
        GIVEN int a = 1, b = -2, c = 3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is non-positive\nc is positive", getConsoleOutput());
    }

    @Test
    void testHighComplexityMethodNonPositiveC() {
        GIVEN int a = 1, b = 2, c = -3;
        WHEN service.highComplexityMethod(a, b, c);
        THEN assertEquals("a is positive\nb is positive\nc is non-positive", getConsoleOutput());
    }

    // Helper method to retrieve console output (replace with actual implementation)
    private String getConsoleOutput() {
        return ""; // Replace with logic to capture console output
    }
}