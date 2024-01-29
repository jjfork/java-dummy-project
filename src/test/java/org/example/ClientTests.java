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
    private Service service;

    @InjectMocks
    private Client client;

    @Test
    public void greeting_shouldReturnUpperCase_whenNameLengthIsEven() {
        // Arrange
        String name = "John";
        when(service.isEven(name.length())).thenReturn(true);

        // Act
        String result = client.greeting(name);

        // Assert
        assertThat(result).isEqualTo("HELLO, JOHN");
    }

    @Test
    public void greeting_shouldReturnLowerCase_whenNameLengthIsOdd() {
        // Arrange
        String name = "Jane";
        when(service.isEven(name.length())).thenReturn(false);

        // Act
        String result = client.greeting(name);

        // Assert
        assertThat(result).isEqualTo("Hello, Jane");
    }

    @Test
    public void greeting_shouldThrowException_whenNameIsNull() {
        // Arrange
        String name = null;

        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            client.greeting(name);
        });
        assertThat(exception.getMessage()).isEqualTo("'name' must not be null or empty");
    }

    @Test
    public void greeting_shouldThrowException_whenNameIsEmpty() {
        // Arrange
        String name = "";

        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            client.greeting(name);
        });
        assertThat(exception.getMessage()).isEqualTo("'name' must not be null or empty");
    }
}