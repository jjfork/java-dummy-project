package org.example.maths;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@ExtendWith(MockitoExtension.class)
public class LiouvilleLambdaFunctionTests {

    @Test
    void testLiouvilleLambda_PositiveNumber_ReturnsCorrectValue() {
        int number = 10;
        int result = LiouvilleLambdaFunction.liouvilleLambda(number);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void testLiouvilleLambda_NegativeNumber_ThrowsException() {
        int number = -5;
        assertThatThrownBy(() -> LiouvilleLambdaFunction.liouvilleLambda(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Number must be greater than zero.");
    }

    @Test
    void testLiouvilleLambda_PrimeNumber_ReturnsCorrectValue() {
        int number = 7;
        int result = LiouvilleLambdaFunction.liouvilleLambda(number);
        assertThat(result).isEqualTo(-1);
    }
}
