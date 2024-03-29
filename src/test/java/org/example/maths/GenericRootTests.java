package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GenericRootTests {

    @Test
    public void testGenericRoot_PositiveNumber_ReturnsGenericRoot() {
        int input = 12345;
        long startTime = System.currentTimeMillis();
        int result = GenericRoot.genericRoot(input);
        long endTime = System.currentTimeMillis();
        assertThat(result).isEqualTo(6);
        assertThat(endTime - startTime).isLessThan(1000);
    }

    @Test
    public void testGenericRoot_NegativeNumber_ReturnsGenericRoot() {
        int input = -54321;
        long startTime = System.currentTimeMillis();
        int result = GenericRoot.genericRoot(input);
        long endTime = System.currentTimeMillis();
        assertThat(result).isEqualTo(6);
        assertThat(endTime - startTime).isLessThan(1000);
    }

    @Test
    public void testGenericRoot_SingleDigitNumber_ReturnsSameNumber() {
        int input = 7;
        long startTime = System.currentTimeMillis();
        int result = GenericRoot.genericRoot(input);
        long endTime = System.currentTimeMillis();
        assertThat(result).isEqualTo(7);
        assertThat(endTime - startTime).isLessThan(1000);
    }
}