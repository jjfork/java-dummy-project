package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PerfectNumberTests {

    @Test
    public void testIsPerfectNumber() {
        int number = 28;
        boolean result = PerfectNumber.isPerfectNumber(number);
        assertTrue(result);
    }

    @Test
    public void testIsPerfectNumber2() {
        int number = 28;
        boolean result = PerfectNumber.isPerfectNumber2(number);
        assertTrue(result);
    }
}