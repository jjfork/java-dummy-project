package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ClientTests {

    private Service serviceMock;
    private Client client;

    @BeforeEach
    void setUp() {
        serviceMock = Mockito.mock(Service.class);
        client = new Client(serviceMock);
    }

    @Test
    void greeting_ValidName_ReturnsGreeting() {
        // GIVEN
        Mockito.when(serviceMock.isEven(5)).thenReturn(false);
        // WHEN
        String result = client.greeting("John");
        // THEN
        assertThat(result).isEqualTo("Hello, John");
    }

    @Test
    void greeting_ValidName_ReturnsUpperCaseGreeting() {
        // GIVEN
        Mockito.when(serviceMock.isEven(6)).thenReturn(true);
        // WHEN
        String result = client.greeting("Jane");
        // THEN
        assertThat(result).isEqualTo("HELLO, JANE");
    }

    @Test
    void greeting_NullName_ThrowsIllegalArgumentException() {
        // GIVEN
        // WHEN
        try {
            client.greeting(null);
        } catch (IllegalArgumentException e) {
            // THEN
            assertThat(e.getMessage()).isEqualTo("'name' must not be null or empty");
        }
    }

    @Test
    void greeting_EmptyName_ThrowsIllegalArgumentException() {
        // GIVEN
        // WHEN
        try {
            client.greeting("");
        } catch (IllegalArgumentException e) {
            // THEN
            assertThat(e.getMessage()).isEqualTo("'name' must not be null or empty");
        }
    }

}
