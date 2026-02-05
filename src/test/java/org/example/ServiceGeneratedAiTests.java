package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServiceGeneratedAiTests {

    @Mock
    private static Service service;

    @BeforeEach
    public void resetService() {
        service = new Service();
    }

    @Test
    public void testIsEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN
        int input = 10;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertThat(result).isTrue();
    }

    @Test
    public void testIsEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN
        int input = 9;

        // WHEN
        boolean result = service.isEven(input);

        // THEN
        assertThat(result).isFalse();
    }

    @Test
    public void testHighComplexityMethod_GivenPositiveValues_PrintsCorrectMessages() {
        // GIVEN
        int a = 5;
        int b = 10;
        int c = 20;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        assertThat(service.getPrintedMessages()).containsExactlyInAnyOrder("a is positive", "b is positive", "c is positive");
    }

    @Test
    public void testHighComplexityMethod_GivenNonPositiveValues_PrintsCorrectMessages() {
        // GIVEN
        int a = -5;
        int b = -10;
        int c = 0;

        // WHEN
        service.highComplexityMethod(a, b, c);

        // THEN
        assertThat(service.getPrintedMessages()).containsExactlyInAnyOrder("a is non-positive", "b is non-positive", "c is non-positive");
    }

    private List<String> serviceGetPrintedMessages() {
        return Arrays.asList(System.out.getOutputStream().toString().split("\n"));
    }
}
