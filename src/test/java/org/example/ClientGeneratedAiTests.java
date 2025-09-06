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

public class ClientGeneratedAiTests {

    private Service service;
    private Client client;

    @BeforeEach
    void setUp() {
        service = new Service();
        client = new Client(service);
    }

    @Test
    void greeting_ValidName_ReturnsGreeting() {
        // GIVEN
        String name = "Alice";
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("Hello, Alice", greeting);
    }

    @Test
    void greeting_EmptyName_ThrowsException() {
        // GIVEN
        String name = "";
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    void greeting_NullName_ThrowsException() {
        // GIVEN
        String name = null;
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    void greeting_EvenLengthName_ReturnsUpperCaseGreeting() {
        // GIVEN
        String name = "Bob";
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("HELLO, BOB", greeting.toUpperCase());
    }

    @Test
    void greeting_OddLengthName_ReturnsLowerCaseGreeting() {
        // GIVEN
        String name = "Charlie";
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("Hello, Charlie", greeting);
    }
}