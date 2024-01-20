package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @Mock
    Service service;

    @InjectMocks
    Client client;

    @Test
    public void greeting_WithValidName_ReturnsGreeting() {
        // Arrange
        String name = "John";
        when(service.isEven(name.length())).thenReturn(false);

        // Act
        String result = client.greeting(name);

        // Assert
        assertThat(result).isEqualTo("Hello, John");
    }

    @Test
    public void greeting_WithEvenLengthName_ReturnsUppercaseGreeting() {
        // Arrange
        String name = "Alice";
        when(service.isEven(name.length())).thenReturn(true);

        // Act
        String result = client.greeting(name);

        // Assert
        assertThat(result).isEqualTo("HELLO, ALICE");
    }

    @Test
    public void greeting_WithNullName_ThrowsIllegalArgumentException() {
        // Arrange
        String name = null;

        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            client.greeting(name);
        });
        assertThat(exception.getMessage()).isEqualTo("'name' must not be null or empty");
    }

    @Test
    public void greeting_WithEmptyName_ThrowsIllegalArgumentException() {
        // Arrange
        String name = "";

        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            client.greeting(name);
        });
        assertThat(exception.getMessage()).isEqualTo("'name' must not be null or empty");
    }
}