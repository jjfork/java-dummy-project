package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class KeithNumberTests {

    @Test
    void testIsKeith_whenNumberIsKeith_thenReturnTrue() {
        int x = 197;
        boolean result = KeithNumber.isKeith(x);
        assertThat(result).isTrue();
    }

    @Test
    void testIsKeith_whenNumberIsNotKeith_thenReturnFalse() {
        int x = 123;
        boolean result = KeithNumber.isKeith(x);
        assertThat(result).isFalse();
    }
}