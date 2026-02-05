package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class ClientGeneratedAiTests {

    @Mock
    private Service service;

    @InjectMocks
    private Client client;

    @BeforeEach
    void setUp() {
        reset(service);
    }

    @Test
    void greeting_withValidName_returnsExpectedGreeting() {
        // GIVEN
        String name = "John Doe";
        when(service.isEven(name.length())).thenReturn(false);

        // WHEN
        String result = client.greeting(name);

        // THEN
        assertThat(result).isEqualTo("Hello, John Doe");
    }

    @Test
    void greeting_withEmptyName_throwsIllegalArgumentException() {
        // GIVEN
        String name = "";

        // WHEN & THEN
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("'name' must not be null or empty");
    }
}
