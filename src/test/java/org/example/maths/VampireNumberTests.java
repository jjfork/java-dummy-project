package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class VampireNumberTests {

    @Test
    void testIsVampireNumber() {
        boolean result = VampireNumber.isVampireNumber(21, 60, true);
        assertThat(result).isTrue();
    }

    @Test
    void testSplitIntoDigits() {
        String result = VampireNumber.splitIntoDigits(123, 456);
        assertThat(result).isEqualTo("123456");
    }
}