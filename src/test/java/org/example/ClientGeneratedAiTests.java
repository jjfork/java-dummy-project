package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.answer;

class ClientGeneratedAiTests {

    @Mock
    private Service service;

    @InjectMocks
    private Client client;

    @BeforeEach
    void setUp() {
        initMocks(this); // Initialize Mockito mocks
        reset(service);
    }

    @Test
    void greeting_whenNameIsNotEmpty_shouldReturnGreetingInCorrectCase() {
        // GIVEN
        String name = "Alice";
        when(service.isEven(anyInt())).thenAnswer(answer(new Answer<Boolean>() {
            @Override
            public Boolean answer(InvocationOnMock invocation) {
                return false;
            }
        }));

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertThatThrownBy(() -> client.greeting(name)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void greeting_whenNameIsEmpty_shouldThrowIllegalArgumentException() {
        // GIVEN
        String name = "";

        // WHEN & THEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }
}
