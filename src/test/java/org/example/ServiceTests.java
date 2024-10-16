package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven() {
        assertTrue(service.isEven(2));
        assertFalse(service.isEven(3));
    }

    @Test
    void testHighComplexityMethod() {
        service.highComplexityMethod(1, 2, 3);
        service.highComplexityMethod(1, 2, 0);
        service.highComplexityMethod(1, 0, 3);
        service.highComplexityMethod(1, 0, 0);
        service.highComplexityMethod(-1, 2, 3);
        service.highComplexityMethod(-1, 2, 0);
        service.highComplexityMethod(-1, 0, 3);
        service.highComplexityMethod(-1, 0, 0);
    }
}
