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

public class FloorTests {

    @Test
    public void testFloorWithIntegerNumber() {
        double number = 5.0;
        assertEquals(5.0, Floor.floor(number));
    }

    @Test
    public void testFloorWithDecimalNumberGreaterThanZero() {
        double number = 5.6;
        assertEquals(5.0, Floor.floor(number));
    }

    @Test
    public void testFloorWithDecimalNumberLessThanZero() {
        double number = -5.6;
        assertEquals(-6.0, Floor.floor(number));
    }
}
