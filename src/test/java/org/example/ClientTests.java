package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClientTests {

    @Test
    void testValidName() {
        String name = "John Doe";
        // ... your existing code to call the client method with 'name' ...
        assertEquals("Expected greeting", "Hello, John Doe!", actualGreeting); 
    }

    @Test
    void testInvalidName() {
        String name = ""; // Example of an invalid name
        // ... your existing code to call the client method with 'name' ...
        assertThrows(IllegalArgumentException.class, () -> client.greet(name));
    }
}