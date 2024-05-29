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
public class LucasSeriesTests {

    @Test
    public void testLucasSeries() {
        assertThat(LucasSeries.lucasSeries(1)).isEqualTo(2);
        assertThat(LucasSeries.lucasSeries(2)).isEqualTo(1);
        assertThat(LucasSeries.lucasSeries(3)).isEqualTo(3);
        assertThat(LucasSeries.lucasSeries(4)).isEqualTo(4);
        assertThat(LucasSeries.lucasSeries(5)).isEqualTo(7);
    }

    @Test
    public void testLucasSeriesIteration() {
        assertThat(LucasSeries.lucasSeriesIteration(1)).isEqualTo(2);
        assertThat(LucasSeries.lucasSeriesIteration(2)).isEqualTo(1);
        assertThat(LucasSeries.lucasSeriesIteration(3)).isEqualTo(3);
        assertThat(LucasSeries.lucasSeriesIteration(4)).isEqualTo(4);
        assertThat(LucasSeries.lucasSeriesIteration(5)).isEqualTo(7);
    }
}
