package org.example.conversions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HexToOctTests {

    @Test
    public void testHex2decimal() {
        // Given
        String hexValue = "1A";
        
        // When
        int decimalValue = HexToOct.hex2decimal(hexValue);
        
        // Then
        assertEquals(26, decimalValue);
    }

    @Test
    public void testDecimal2octal() {
        // Given
        int decimalValue = 26;
        
        // When
        int octalValue = HexToOct.decimal2octal(decimalValue);
        
        // Then
        assertEquals(32, octalValue);
    }
}
