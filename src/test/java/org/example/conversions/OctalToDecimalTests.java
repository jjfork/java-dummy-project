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

public class OctalToDecimalTests {

    @Test
    void testConvertOctalToDecimal_validInput() {
        // Given
        String inputOctal = "12";
        
        // When
        int result = OctalToDecimal.convertOctalToDecimal(inputOctal);
        
        // Then
        assertEquals(10, result);
    }
    
    @Test
    void testConvertOctalToDecimal_invalidInput() {
        // Given
        String inputOctal = "8";
        
        // When
        int result = OctalToDecimal.convertOctalToDecimal(inputOctal);
        
        // Then
        assertEquals(-1, result);
    }
}
