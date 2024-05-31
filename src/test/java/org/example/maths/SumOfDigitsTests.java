package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SumOfDigitsTests {

    @Test
    public void testSumOfDigits() {
        int result = SumOfDigits.sumOfDigits(12345);
        assertThat(result).isEqualTo(15);
    }

    @Test
    public void testSumOfDigitsRecursion() {
        int result = SumOfDigits.sumOfDigitsRecursion(12345);
        assertThat(result).isEqualTo(15);
    }

    @Test
    public void testSumOfDigitsFast() {
        int result = SumOfDigits.sumOfDigitsFast(12345);
        assertThat(result).isEqualTo(15);
    }
}
