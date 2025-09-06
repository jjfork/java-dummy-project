package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ServiceTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven() {
        assertThat(service.isEven(2)).isTrue();
        assertThat(service.isEven(7)).isFalse();
    }

    @Test
    void testHighComplexityMethod() {
        service.highComplexityMethod(1, 2, 3);
        // Assertions for the output of highComplexityMethod
    }
}
