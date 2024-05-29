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

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class KeithNumberTests {

    @Test
    void testIsKeithForKeithNumber() {
        // Arrange
        int x = 197;
        
        // Act
        boolean result = KeithNumber.isKeith(x);
        
        // Assert
        assertThat(result).isTrue();
    }

    @Test
    void testIsKeithForNonKeithNumber() {
        // Arrange
        int x = 123;
        
        // Act
        boolean result = KeithNumber.isKeith(x);
        
        // Assert
        assertThat(result).isFalse();
    }

    @Test
    void testIsKeithForZero() {
        // Arrange
        int x = 0;
        
        // Act
        boolean result = KeithNumber.isKeith(x);
        
        // Assert
        assertThat(result).isTrue();
    }
}
