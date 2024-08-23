package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ServiceTests {

    @Test
    void testIsEven() {
        Service service = new Service();
        assertThat(service.isEven(2)).isTrue();
        assertThat(service.isEven(3)).isFalse();
    }

    @Test
    void testHighComplexityMethod() {
        Service service = new Service();
        service.highComplexityMethod(1, 1, 1);
        service.highComplexityMethod(1, -1, 1);
        service.highComplexityMethod(-1, 1, 1);
        service.highComplexityMethod(-1, -1, 1);
        service.highComplexityMethod(-1, -1, -1);
    }
} 
