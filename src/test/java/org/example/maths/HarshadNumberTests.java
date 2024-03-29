package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class HarshadNumberTests {

    @Test
    public void testIsHarshad_withLong_ValidInput() {
        long input = 18;
        boolean result = HarshadNumber.isHarshad(input);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsHarshad_withLong_InvalidInput() {
        long input = 25;
        boolean result = HarshadNumber.isHarshad(input);
        assertThat(result).isFalse();
    }

    @Test
    public void testIsHarshad_withString_ValidInput() {
        String input = "18";
        boolean result = HarshadNumber.isHarshad(input);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsHarshad_withString_InvalidInput() {
        String input = "25";
        boolean result = HarshadNumber.isHarshad(input);
        assertThat(result).isFalse();
    }
}