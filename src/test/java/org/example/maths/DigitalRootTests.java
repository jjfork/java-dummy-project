package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DigitalRootTests {

    @Test
    void testDigitalRoot_singleDigit() {
        int result = DigitalRoot.digitalRoot(5);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void testDigitalRoot_multipleDigits() {
        int result = DigitalRoot.digitalRoot(12345);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void testSingle_singleDigit() {
        int result = DigitalRoot.single(7);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void testSingle_multipleDigits() {
        int result = DigitalRoot.single(12345);
        assertThat(result).isEqualTo(15);
    }
}