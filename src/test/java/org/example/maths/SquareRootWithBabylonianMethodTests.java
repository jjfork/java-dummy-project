package org.example.maths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareRootWithBabylonianMethodTests {

    @Test
    public void testSquare_Root() {
        float num = 25;
        float expected = 5.0f;
        float result = SquareRootWithBabylonianMethod.square_Root(num);
        assertEquals(expected, result, 0.000001);
    }

    @Test
    public void testSquare_RootWithDecimal() {
        float num = 2.25f;
        float expected = 1.5f;
        float result = SquareRootWithBabylonianMethod.square_Root(num);
        assertEquals(expected, result, 0.000001);
    }

    @Test
    public void testSquare_RootWithLargeNumber() {
        float num = 10000;
        float expected = 100.0f;
        float result = SquareRootWithBabylonianMethod.square_Root(num);
        assertEquals(expected, result, 0.000001);
    }
}
