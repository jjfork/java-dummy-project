package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
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
        int expectedWinner = 3;

        int actualWinner = JosephusProblem.findTheWinner(n, k);

        assertThat(actualWinner).isEqualTo(expectedWinner);
    }

    @Test
    public void testWinner() {
        int n = 7;
        int k = 3;
        int expectedWinner = 3;

        int actualWinner = JosephusProblem.winner(n, k);

        assertThat(actualWinner).isEqualTo(expectedWinner);
    }
}
