package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ClientTests {

    @Mock
    private Service service;
    private Client client;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        client = new Client(service);
    }

    @Test
    void greeting_withValidName_returnsGreeting() {
        // GIVEN
        String name = "John";
        when(service.greet(name)).thenReturn("Hello, John");
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertThat(greeting).isEqualTo("Hello, John");
    }

    @Test
    void greeting_withEmptyName_throwsIllegalArgumentException() {
        // GIVEN
        String name = "";
        // WHEN
        // THEN
        assertThatThrownBy(() -> client.greeting(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("name must not be null or empty");
    }

    @Test
    void greeting_withEvenLengthName_returnsUpperCaseGreeting() {
        // GIVEN
        String name = "Alice";
        when(service.greet(name)).thenReturn("HELLO, ALICE");
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertThat(greeting).isEqualTo("HELLO, ALICE");
    }

    @Test
    void greeting_withOddLengthName_returnsLowerCaseGreeting() {
        // GIVEN
        String name = "Bob";
        when(service.greet(name)).thenReturn("Hello, Bob");
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertThat(greeting).isEqualTo("Hello, Bob");
    }

}
