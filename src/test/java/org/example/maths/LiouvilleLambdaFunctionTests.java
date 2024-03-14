package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LiouvilleLambdaFunctionTests {

    @Test
    void liouvilleLambda_WithPositiveNumber_ReturnsCorrectValue() {
        // Arrange
        int number = 10;

        // Act
        int result = LiouvilleLambdaFunction.liouvilleLambda(number);

        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    void liouvilleLambda_WithNegativeNumber_ThrowsIllegalArgumentException() {
        // Arrange
        int number = -5;

        // Act and Assert
        assertThatThrownBy(() -> LiouvilleLambdaFunction.liouvilleLambda(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Number must be greater than zero.");
    }

    @Test
    void liouvilleLambda_WithZero_ThrowsIllegalArgumentException() {
        // Arrange
        int number = 0;

        // Act and Assert
        assertThatThrownBy(() -> LiouvilleLambdaFunction.liouvilleLambda(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Number must be greater than zero.");
    }
}