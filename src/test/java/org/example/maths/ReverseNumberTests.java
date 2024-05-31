package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ReverseNumberTests {

    @Test
    public void testReverseNumber_PositiveNumber() {
        int number = 12345;
        int expected = 54321;
        
        int result = ReverseNumber.reverseNumber(number);
        
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testReverseNumber_Zero() {
        int number = 0;
        int expected = 0;
        
        int result = ReverseNumber.reverseNumber(number);
        
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testReverseNumber_NegativeNumber() {
        int number = -12345;
        
        assertThrows(IllegalArgumentException.class, () -> {
            ReverseNumber.reverseNumber(number);
        });
    }
}
