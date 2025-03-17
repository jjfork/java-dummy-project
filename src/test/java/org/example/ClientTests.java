package org.example;

import org.junit.jupiter.api.Assertions; 

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;

public class ClientTests {

    @Mock
    private Client client;

    @Test
    void testClientName() {
        client.setName("John Doe");
        Assertions.assertEquals("John Doe", client.getName()); 
    }

    @Test
    void testInvalidClientName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> client.setName("")); 
    }
}
