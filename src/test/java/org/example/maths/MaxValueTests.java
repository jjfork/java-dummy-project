package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MaxValueTests {

    @Test
    public void testMax_WhenAIsGreater_ShouldReturnA() {
        int a = 5;
        int b = 3;
        int result = MaxValue.max(a, b);
        assertThat(result).isEqualTo(a);
    }

    @Test
    public void testMax_WhenBIsGreater_ShouldReturnB() {
        int a = 3;
        int b = 5;
        int result = MaxValue.max(a, b);
        assertThat(result).isEqualTo(b);
    }
}