package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ClientTests {

    @Test
    void testGreetingValidName() {
        Service mockService = mock(Service.class);
        when(mockService.isEven(anyInt())).thenReturn(true);

        Client client = new Client(mockService);
        String result = client.greeting("Alice");

        assertEquals("HELLO, ALICE", result);
        verify(mockService).isEven(5);
    }

    @Test
    void testGreetingInvalidName() {
        Service mockService = mock(Service.class);

        Client client = new Client(mockService);

        assertThrows(IllegalArgumentException.class, () -> client.greeting(null));
        assertThrows(IllegalArgumentException.class, () -> client.greeting(""));
    }
}
