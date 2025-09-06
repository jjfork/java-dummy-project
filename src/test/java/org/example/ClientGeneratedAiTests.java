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

class ClientGeneratedAiTests {

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
        Mockito.when(serviceMock.isNameValid("John")).thenReturn(true);
        // WHEN
        String greeting = client.greet("John");
        // THEN
        assertThat(greeting).isEqualTo("Hello John!");
    }

    @Test
    void greeting_InvalidName_ReturnsDefaultMessage() {
        // GIVEN
        Mockito.when(serviceMock.isNameValid("Jane")).thenReturn(false);
        // WHEN
        String greeting = client.greet("Jane");
        // THEN
        assertThat(greeting).isEqualTo("Invalid name.");
    }

}
