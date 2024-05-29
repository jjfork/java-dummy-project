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

public class SquareRootWithBabylonianMethodTests {

    @Test
    void testSquareRoot() {
        float num = 25;
        float expected = 5;
        float result = SquareRootWithBabylonianMethod.square_Root(num);
        assertEquals(expected, result, 0.000001);
    }

    @Test
    void testSquareRootWithDecimal() {
        float num = 2.25f;
        float expected = 1.5f;
        float result = SquareRootWithBabylonianMethod.square_Root(num);
        assertEquals(expected, result, 0.000001);
    }

    @Test
    void testSquareRootWithLargeNumber() {
        float num = 123456789;
        float expected = 11111.1111f;
        float result = SquareRootWithBabylonianMethod.square_Root(num);
        assertEquals(expected, result, 0.000001);
    }
}