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
public class MedianTests {

    @Test
    public void testMedian_oddLength() {
        int[] values = {3, 1, 2, 4, 5};
        double expected = 3.0;
        
        double result = Median.median(values);
        
        assertThat(result).isEqualTo(expected);
    }
    
    @Test
    public void testMedian_evenLength() {
        int[] values = {3, 1, 2, 4};
        double expected = 2.5;
        
        double result = Median.median(values);
        
        assertThat(result).isEqualTo(expected);
    }
}