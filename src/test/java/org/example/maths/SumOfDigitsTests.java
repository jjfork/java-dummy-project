package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class SumOfDigitsTests {

    @Test
    public void testSumOfDigits() {
        int result = SumOfDigits.sumOfDigits(123);
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void testSumOfDigitsNegativeNumber() {
        int result = SumOfDigits.sumOfDigits(-456);
        assertThat(result).isEqualTo(15);
    }

    @Test
    public void testSumOfDigitsRecursion() {
        int result = SumOfDigits.sumOfDigitsRecursion(789);
        assertThat(result).isEqualTo(24);
    }

    @Test
    public void testSumOfDigitsRecursionNegativeNumber() {
        int result = SumOfDigits.sumOfDigitsRecursion(-987);
        assertThat(result).isEqualTo(24);
    }

    @Test
    public void testSumOfDigitsFast() {
        int result = SumOfDigits.sumOfDigitsFast(246);
        assertThat(result).isEqualTo(12);
    }

    @Test
    public void testSumOfDigitsFastNegativeNumber() {
        int result = SumOfDigits.sumOfDigitsFast(-753);
        assertThat(result).isEqualTo(15);
    }
}