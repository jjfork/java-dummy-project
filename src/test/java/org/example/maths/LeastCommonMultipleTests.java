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

public class LeastCommonMultipleTests {

    @Test
    public void testLcm() {
        int result = LeastCommonMultiple.lcm(4, 6);
        assertEquals(12, result);
    }

    @Test
    public void testLcmWithSameNumbers() {
        int result = LeastCommonMultiple.lcm(5, 5);
        assertEquals(5, result);
    }

    @Test
    public void testLcmWithPrimeNumbers() {
        int result = LeastCommonMultiple.lcm(7, 11);
        assertEquals(77, result);
    }
}
