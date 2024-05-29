package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrizzyNumberTests {

    @Test
    void testGetNthFrizzy() {
        assertEquals(0.0, FrizzyNumber.getNthFrizzy(2, 0));
        assertEquals(1.0, FrizzyNumber.getNthFrizzy(2, 1));
        assertEquals(2.0, FrizzyNumber.getNthFrizzy(2, 2));
        assertEquals(3.0, FrizzyNumber.getNthFrizzy(2, 3));
        assertEquals(4.0, FrizzyNumber.getNthFrizzy(2, 4));
    }
}
