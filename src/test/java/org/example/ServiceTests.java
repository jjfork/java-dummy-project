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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ServiceTests {

    @Test
    void testIsEven() {
        Service service = new Service();
        assertTrue(service.isEven(2));
        assertFalse(service.isEven(3));
    }

    @Test
    void testHighComplexityMethod() {
        Service service = new Service();
        // Test case 1
        service.highComplexityMethod(1, 2, 3);
        // Add assertions here
        
        // Test case 2
        service.highComplexityMethod(-1, -2, -3);
        // Add assertions here
        
        // Test case 3
        service.highComplexityMethod(0, 1, -1);
        // Add assertions here
    }
}
