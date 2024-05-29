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
public class ArmstrongTests {

    private Armstrong armstrong = new Armstrong();

    @Test
    public void testIsArmstrongWithArmstrongNumber() {
        boolean result = armstrong.isArmstrong(153);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsArmstrongWithNonArmstrongNumber() {
        boolean result = armstrong.isArmstrong(123);
        assertThat(result).isFalse();
    }

    @Test
    public void testIsArmstrongWithSingleDigitNumber() {
        boolean result = armstrong.isArmstrong(5);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsArmstrongWithZero() {
        boolean result = armstrong.isArmstrong(0);
        assertThat(result).isTrue();
    }

}
