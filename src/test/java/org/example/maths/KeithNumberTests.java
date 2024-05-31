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

@ExtendWith(MockitoExtension.class)
class KeithNumberTests {

    @Test
    void testIsKeithForKeithNumber() {
        assertThat(KeithNumber.isKeith(197)).isTrue();
    }

    @Test
    void testIsKeithForNonKeithNumber() {
        assertThat(KeithNumber.isKeith(123)).isFalse();
    }

    @Test
    void testIsKeithForSingleDigitNumber() {
        assertThat(KeithNumber.isKeith(5)).isTrue();
    }

    @Test
    void testIsKeithForZero() {
        assertThat(KeithNumber.isKeith(0)).isTrue();
    }

}
