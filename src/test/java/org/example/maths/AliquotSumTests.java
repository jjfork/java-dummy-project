package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class AliquotSumTests {

    @Test
    public void testGetAliquotValue() {
        int result = AliquotSum.getAliquotValue(28);
        assertThat(result).isEqualTo(28);
    }

    @Test
    public void testGetAliquotSum() {
        int result = AliquotSum.getAliquotSum(28);
        assertThat(result).isEqualTo(28);
    }

    @Test
    public void testGetAliquotSum_NegativeInput() {
        int result = AliquotSum.getAliquotSum(-5);
        assertThat(result).isEqualTo(-1);
    }

}
