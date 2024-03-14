package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GenericRootTests {

    @Test
    public void testGenericRoot_PositiveNumber() {
        int result = GenericRoot.genericRoot(123);
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void testGenericRoot_NegativeNumber() {
        int result = GenericRoot.genericRoot(-456);
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void testGenericRoot_SingleDigitNumber() {
        int result = GenericRoot.genericRoot(7);
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void testGenericRoot_Zero() {
        int result = GenericRoot.genericRoot(0);
        assertThat(result).isEqualTo(0);
    }
}