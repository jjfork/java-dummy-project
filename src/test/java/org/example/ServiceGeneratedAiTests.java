package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

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
        //GIVEN
        int input = 4;
        //WHEN
        boolean result = service.isEven(input);
        //THEN
        assertTrue(result);
    }

    @Test
    void isEven_GivenOddNumber_ReturnsFalse() {
        //GIVEN
        int input = 7;
        //WHEN
        boolean result = service.isEven(input);
        //THEN
        assertFalse(result);
    }
}
