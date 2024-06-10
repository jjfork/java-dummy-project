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
class BinaryToDecimalTests {

    @Test
    void testBinaryToDecimal() {
        // Given
        long binaryNumber = 1010L;
        
        // When
        long decimalResult = BinaryToDecimal.binaryToDecimal(binaryNumber);
        
        // Then
        assertThat(decimalResult).isEqualTo(10L);
    }
}
