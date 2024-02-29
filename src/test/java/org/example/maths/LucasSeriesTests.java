package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LucasSeriesTests {

    @Test
    public void testLucasSeries() {
        assertEquals(2, LucasSeries.lucasSeries(1));
        assertEquals(1, LucasSeries.lucasSeries(2));
        assertEquals(3, LucasSeries.lucasSeries(3));
        assertEquals(4, LucasSeries.lucasSeries(4));
        assertEquals(7, LucasSeries.lucasSeries(5));
    }

    @Test
    public void testLucasSeriesIteration() {
        assertEquals(2, LucasSeries.lucasSeriesIteration(1));
        assertEquals(1, LucasSeries.lucasSeriesIteration(2));
        assertEquals(3, LucasSeries.lucasSeriesIteration(3));
        assertEquals(4, LucasSeries.lucasSeriesIteration(4));
        assertEquals(7, LucasSeries.lucasSeriesIteration(5));
    }
}