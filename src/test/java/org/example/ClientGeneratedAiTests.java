package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class ClientGeneratedAiTests {

    private Service serviceMock;
    private Client client;

    @BeforeEach
    void setUp() {
        serviceMock = Mockito.mock(Service.class);
        client = new Client(serviceMock);
    }

    @Test
    void testGreeting() {
        // GIVEN
        String expectedGreeting = "Hello, World!";

        // WHEN
        String actualGreeting = client.greet();

        // THEN
        assertThat(actualGreeting).isEqualTo(expectedGreeting);
    }


    @Test
    void testGreetingWithCustomName() {
        // GIVEN
        String name = "Alice";
        String expectedGreeting = "Hello, Alice!";

        // WHEN
        String actualGreeting = client.greet(name);

        // THEN
        assertThat(actualGreeting).isEqualTo(expectedGreeting);
    }


}
