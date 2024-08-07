package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ClientTests {

    @Mock
    Service service;

    @Test
    void testGreetingUpperCase() {
        when(service.isEven(anyInt())).thenReturn(true);
        Client client = new Client(service);
        String result = client.greeting("John");
        assertEquals("HELLO, JOHN", result);
    }

    @Test
    void testGreetingLowerCase() {
        when(service.isEven(anyInt())).thenReturn(false);
        Client client = new Client(service);
        String result = client.greeting("Alice");
        assertEquals("Hello, Alice", result);
    }

    @Test
    void testGreetingNullName() {
        Client client = new Client(service);
        assertThrows(IllegalArgumentException.class, () -> client.greeting(null));
    }

    @Test
    void testGreetingEmptyName() {
        Client client = new Client(service);
        assertThrows(IllegalArgumentException.class, () -> client.greeting(""));
    }

}
