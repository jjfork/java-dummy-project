package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FloorTests {

    @Test
    public void testFloorWithIntegerNumber() {
        double number = 5.0;
        double result = Floor.floor(number);
        assertThat(result).isEqualTo(number);
    }

    @Test
    public void testFloorWithDecimalNumberGreaterThanZero() {
        double number = 5.6;
        double result = Floor.floor(number);
        assertThat(result).isEqualTo(5.0);
    }

    @Test
    public void testFloorWithDecimalNumberLessThanZero() {
        double number = -5.6;
        double result = Floor.floor(number);
        assertThat(result).isEqualTo(-6.0);
    }
}