package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

public class ClientTests {

    @ExtendWith(MockitoExtension.class)
    @Test
    void testGreeting() {
        Service service = Mockito.mock(Service.class);
        Mockito.when(service.isEven("test".length())).thenReturn(true);

        Client client = new Client(service);
        String result = client.greeting("test");

        Mockito.verify(service, Mockito.times(1)).isEven("test".length());
        assertThat(result).isEqualTo("HELLO, TEST");
    }

    @BeforeEach
    void setup() {
        Mockito.reset();
    }

    @Test
    void testGreetingNullName() {
        Service service = mock(Service.class);

        Client client = new Client(service);
        assertThrows(IllegalArgumentException.class, () -> client.greeting(null));
    }

    @Test
    void testGreetingBlankName() {
        Service service = mock(Service.class);

        Client client = new Client(service);
        assertThrows(IllegalArgumentException.class, () -> client.greeting("   "));
    }
}