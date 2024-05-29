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
public class GenericRootTests {

    @Test
    public void testGenericRoot_PositiveNumber() {
        int result = GenericRoot.genericRoot(12345);
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void testGenericRoot_NegativeNumber() {
        int result = GenericRoot.genericRoot(-12345);
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void testGenericRoot_SingleDigitNumber() {
        int result = GenericRoot.genericRoot(5);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testGenericRoot_Zero() {
        int result = GenericRoot.genericRoot(0);
        assertThat(result).isEqualTo(0);
    }

}
