package org.example.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FloorTests {

    @Test
    public void testFloor_whenNumberIsInteger_thenReturnSameNumber() {
        // Arrange
        double number = 5.0;

        // Act
        double result = Floor.floor(number);

        // Assert
        assertThat(result).isEqualTo(number);
    }

    @Test
    public void testFloor_whenNumberIsDecimal_thenReturnFloorNumber() {
        // Arrange
        double number = 5.6;

        // Act
        double result = Floor.floor(number);

        // Assert
        assertThat(result).isEqualTo(5.0);
    }

    @Test
    public void testFloor_whenNumberIsNegative_thenReturnFloorNumber() {
        // Arrange
        double number = -5.6;

        // Act
        double result = Floor.floor(number);

        // Assert
        assertThat(result).isEqualTo(-6.0);
    }
}