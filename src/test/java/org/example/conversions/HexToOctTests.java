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
public class HexToOctTests {

    @Test
    public void testHex2decimal() {
        // Given
        String hex = "1A";
        
        // When
        int result = HexToOct.hex2decimal(hex);
        
        // Then
        assertThat(result).isEqualTo(26);
    }

    @Test
    public void testDecimal2octal() {
        // Given
        int decimal = 26;
        
        // When
        int result = HexToOct.decimal2octal(decimal);
        
        // Then
        assertThat(result).isEqualTo(32);
    }
}
