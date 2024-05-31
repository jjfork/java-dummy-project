package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class KaprekarNumbersTests {

    @Test
    public void testKaprekarNumberInRange_validRange() throws Exception {
        List<Long> kaprekarNumbers = KaprekarNumbers.kaprekarNumberInRange(1, 100);
        assertThat(kaprekarNumbers).isNotEmpty();
    }

    @Test
    public void testKaprekarNumberInRange_invalidRange() {
        assertThrows(Exception.class, () -> KaprekarNumbers.kaprekarNumberInRange(100, 1));
    }

    @Test
    public void testIsKaprekarNumber_true() {
        boolean result = KaprekarNumbers.isKaprekarNumber(9);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsKaprekarNumber_false() {
        boolean result = KaprekarNumbers.isKaprekarNumber(10);
        assertThat(result).isFalse();
    }
}
