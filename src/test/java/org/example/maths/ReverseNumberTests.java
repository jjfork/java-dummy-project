package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ReverseNumberTests {

    @Test
    public void reverseNumber_WithPositiveNumber_ShouldReturnReversedNumber() {
        int number = 12345;
        int result = ReverseNumber.reverseNumber(number);
        assertThat(result).isEqualTo(54321);
    }

    @Test
    public void reverseNumber_WithZero_ShouldReturnZero() {
        int number = 0;
        int result = ReverseNumber.reverseNumber(number);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void reverseNumber_WithNegativeNumber_ShouldThrowIllegalArgumentException() {
        int number = -123;
        assertThrows(IllegalArgumentException.class, () -> ReverseNumber.reverseNumber(number));
    }
}