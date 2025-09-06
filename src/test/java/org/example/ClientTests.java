package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ClientTests {

    @Test
    void testGreeting() {
        Service mockService = mock(Service.class);
        when(mockService.isEven(anyInt())).thenReturn(true);

        Client client = new Client(mockService);
        String result = client.greeting("John");

        assertEquals("HELLO, JOHN", result);
        verify(mockService, times(1)).isEven(anyInt());
    }

    @Test
    void testGreetingWithOddLengthName() {
        Service mockService = mock(Service.class);
        when(mockService.isEven(anyInt())).thenReturn(false);

        Client client = new Client(mockService);
        String result = client.greeting("Alice");

        assertEquals("Hello, Alice", result);
        verify(mockService, times(1)).isEven(anyInt());
    }

    @Test
    void testGreetingWithNullName() {
        Service mockService = mock(Service.class);

        Client client = new Client(mockService);

        assertThrows(IllegalArgumentException.class, () -> client.greeting(null));
        verifyNoInteractions(mockService);
    }

    @Test
    void testGreetingWithEmptyName() {
        Service mockService = mock(Service.class);

        Client client = new Client(mockService);

        assertThrows(IllegalArgumentException.class, () -> client.greeting(""));
        verifyNoInteractions(mockService);
    }
}
