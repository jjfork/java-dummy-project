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
public class HarshadNumberTests {

    @Test
    public void testIsHarshadWithLong_ValidHarshadNumber_ReturnsTrue() {
        long n = 18;
        boolean result = HarshadNumber.isHarshad(n);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsHarshadWithLong_InvalidHarshadNumber_ReturnsFalse() {
        long n = 19;
        boolean result = HarshadNumber.isHarshad(n);
        assertThat(result).isFalse();
    }

    @Test
    public void testIsHarshadWithString_ValidHarshadNumber_ReturnsTrue() {
        String s = "18";
        boolean result = HarshadNumber.isHarshad(s);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsHarshadWithString_InvalidHarshadNumber_ReturnsFalse() {
        String s = "19";
        boolean result = HarshadNumber.isHarshad(s);
        assertThat(result).isFalse();
    }
}