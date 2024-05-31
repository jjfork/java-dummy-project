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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class HarshadNumberTests {

    @Test
    public void testIsHarshadWithPositiveNumber() {
        assertTrue(HarshadNumber.isHarshad(18));
    }

    @Test
    public void testIsHarshadWithNegativeNumber() {
        assertFalse(HarshadNumber.isHarshad(-18));
    }

    @Test
    public void testIsHarshadWithString() {
        assertTrue(HarshadNumber.isHarshad("18"));
    }

    @Test
    public void testIsHarshadWithNegativeString() {
        assertFalse(HarshadNumber.isHarshad("-18"));
    }

}
