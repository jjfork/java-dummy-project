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
    void isEven_GivenZero_ReturnsTrue() {
        // GIVEN the number zero
        int input = 0;
        // WHEN the isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void isEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN the isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void isEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 7;
        // WHEN the isEven method is called with the input
        boolean result = service.isEven(input);
        // THEN the result should be false
        assertFalse(result);
    }

}
