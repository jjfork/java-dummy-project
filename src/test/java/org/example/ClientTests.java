package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.mockito.Mockito;

class ClientTests {

    @Test
    void greeting_validName_returnsGreeting() {
        Service service = Mockito.mock(Service.class);
        Mockito.when(service.isEven(5)).thenReturn(false);
        Client client = new Client(service);
        String greeting = client.greeting("John");
        assertThat(greeting).isEqualTo("Hello, John");
    }

    @Test
    void greeting_validName_returnsUpperCaseGreeting() {
        Service service = Mockito.mock(Service.class);
        Mockito.when(service.isEven(4)).thenReturn(true);
        Client client = new Client(service);
        String greeting = client.greeting("Jane");
        assertThat(greeting).isEqualTo("HELLO, JANE");
    }

    @Test
    void greeting_nullName_throwsIllegalArgumentException() {
        Service service = Mockito.mock(Service.class);
        Client client = new Client(service);
        assertThatThrownBy(() -> client.greeting(null)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void greeting_emptyName_throwsIllegalArgumentException() {
        Service service = Mockito.mock(Service.class);
        Client client = new Client(service);
        assertThatThrownBy(() -> client.greeting("")).isInstanceOf(IllegalArgumentException.class);
    }
}
