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

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class JosephusProblemTests {

    @Test
    public void testFindTheWinner() {
        int n = 5;
        int k = 2;
        int expected = 3;
        
        int result = JosephusProblem.findTheWinner(n, k);
        
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testWinner() {
        int n = 5;
        int k = 2;
        int expected = 2;
        
        int result = JosephusProblem.winner(n, k);
        
        assertThat(result).isEqualTo(expected);
    }
}
