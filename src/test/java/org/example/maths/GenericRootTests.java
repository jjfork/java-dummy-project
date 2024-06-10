package org.example.maths;

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
public class GenericRootTests {

    @Test
    public void testGenericRoot_PositiveNumber() {
        int n = 12345;
        int expected = 6;
        
        int result = GenericRoot.genericRoot(n);
        
        assertThat(result).isEqualTo(expected);
    }
    
    @Test
    public void testGenericRoot_NegativeNumber() {
        int n = -54321;
        int expected = 6;
        
        int result = GenericRoot.genericRoot(n);
        
        assertThat(result).isEqualTo(expected);
    }
    
    @Test
    public void testGenericRoot_SingleDigitNumber() {
        int n = 7;
        int expected = 7;
        
        int result = GenericRoot.genericRoot(n);
        
        assertThat(result).isEqualTo(expected);
    }
}