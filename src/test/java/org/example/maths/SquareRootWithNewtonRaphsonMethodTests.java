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

public class SquareRootWithNewtonRaphsonMethodTests {

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, SquareRootWithNewtonRaphsonMethod.squareRoot(25));
        assertEquals(10.0, SquareRootWithNewtonRaphsonMethod.squareRoot(100));
        assertEquals(3.0, SquareRootWithNewtonRaphsonMethod.squareRoot(9));
    }
}
