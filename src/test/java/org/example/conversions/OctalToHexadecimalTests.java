package org.example.conversions;

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
public class OctalToHexadecimalTests {

    @Test
    public void testOctToDec() {
        // Given
        String octalNumber = "17";
        
        // When
        int result = OctalToHexadecimal.octToDec(octalNumber);
        
        // Then
        assertThat(result).isEqualTo(15);
    }

    @Test
    public void testDecimalToHex() {
        // Given
        int decimalNumber = 15;
        
        // When
        String result = OctalToHexadecimal.decimalToHex(decimalNumber);
        
        // Then
        assertThat(result).isEqualTo("F");
    }
}
