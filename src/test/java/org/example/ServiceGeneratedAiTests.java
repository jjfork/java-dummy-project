package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
    void isEven_GivenEvenNumber_ReturnsTrue() {
        // GIVEN an even number
        int input = 4;
        // WHEN the isEven method is called
        boolean result = service.isEven(input);
        // THEN it should return true
        assertTrue(result);
    }

    @Test
    void isEven_GivenOddNumber_ReturnsFalse() {
        // GIVEN an odd number
        int input = 7;
        // WHEN the isEven method is called
        boolean result = service.isEven(input);
        // THEN it should return false
        assertFalse(result);
    }

}
