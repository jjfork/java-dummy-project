package org.example.conversions;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BinaryToHexadecimalTests {

    @Test
    void testBinToHex() {
        // Given
        int binary = 1010;
        String expectedHex = "A";

        // When
        String actualHex = BinaryToHexadecimal.binToHex(binary);

        // Then
        assertEquals(expectedHex, actualHex);
    }

    @Test
    void testBinToHexWithZero() {
        // Given
        int binary = 0;
        String expectedHex = "";

        // When
        String actualHex = BinaryToHexadecimal.binToHex(binary);

        // Then
        assertEquals(expectedHex, actualHex);
    }

    // Add more test cases as needed
}
