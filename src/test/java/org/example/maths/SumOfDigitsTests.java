package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SumOfDigitsTests {

    @Test
    public void testSumOfDigits() {
        int number = 12345;
        int result = SumOfDigits.sumOfDigits(number);
        assertThat(result).isEqualTo(15);
    }

    @Test
    public void testSumOfDigitsRecursion() {
        int number = 12345;
        int result = SumOfDigits.sumOfDigitsRecursion(number);
        assertThat(result).isEqualTo(15);
    }

    @Test
    public void testSumOfDigitsFast() {
        int number = 12345;
        int result = SumOfDigits.sumOfDigitsFast(number);
        assertThat(result).isEqualTo(15);
    }
}