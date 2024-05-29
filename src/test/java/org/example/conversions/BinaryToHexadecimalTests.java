package org.example.conversions;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryToHexadecimalTests {

    @Test
    void testBinToHex() {
        // Test case 1: Binary input 1010 should return "A" in hexadecimal
        assertEquals("A", BinaryToHexadecimal.binToHex(1010));

        // Test case 2: Binary input 1101 should return "D" in hexadecimal
        assertEquals("D", BinaryToHexadecimal.binToHex(1101));

        // Test case 3: Binary input 1111 should return "F" in hexadecimal
        assertEquals("F", BinaryToHexadecimal.binToHex(1111));

        // Additional test cases can be added here
    }
}