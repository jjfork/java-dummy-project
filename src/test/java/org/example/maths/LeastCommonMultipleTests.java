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

public class LeastCommonMultipleTests {

    @Test
    public void testLcm() {
        assertEquals(12, LeastCommonMultiple.lcm(4, 6));
    }

    @Test
    public void testLcmSameNumber() {
        assertEquals(5, LeastCommonMultiple.lcm(5, 5));
    }

    @Test
    public void testLcmPrimeNumbers() {
        assertEquals(77, LeastCommonMultiple.lcm(7, 11));
    }

    @Test
    public void testLcmZero() {
        assertEquals(0, LeastCommonMultiple.lcm(0, 5));
    }

}
