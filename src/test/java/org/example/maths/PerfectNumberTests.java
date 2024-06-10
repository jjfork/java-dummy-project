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
public class PerfectNumberTests {

    @Test
    public void testIsPerfectNumber() {
        int number = 28;
        boolean result = PerfectNumber.isPerfectNumber(number);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsPerfectNumber2() {
        int number = 28;
        boolean result = PerfectNumber.isPerfectNumber2(number);
        assertThat(result).isTrue();
    }
}