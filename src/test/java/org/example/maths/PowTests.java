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
public class PowTests {

    @Test
    public void testPow() {
        int a = 2;
        int b = 3;
        long result = Pow.pow(a, b);
        assertThat(result).isEqualTo(8);
    }
    
    @Test
    public void testPowWithZeroExponent() {
        int a = 5;
        int b = 0;
        long result = Pow.pow(a, b);
        assertThat(result).isEqualTo(1);
    }
    
    @Test
    public void testPowWithNegativeBase() {
        int a = -3;
        int b = 2;
        long result = Pow.pow(a, b);
        assertThat(result).isEqualTo(9);
    }
}