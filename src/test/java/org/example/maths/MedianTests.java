package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MedianTests {

    @Test
    public void testMedianOddLength() {
        int[] values = {3, 1, 2, 5, 4};
        double expected = 3.0;
        double actual = Median.median(values);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testMedianEvenLength() {
        int[] values = {3, 1, 2, 5, 4, 6};
        double expected = 3.5;
        double actual = Median.median(values);
        assertThat(actual).isEqualTo(expected);
    }
}