package org.example.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DecimalToAnyBaseTests {

    @Test
    public void testConvertToAnyBase() {
        // Arrange
        int inp = 10;
        int base = 2;

        // Act
        String result = DecimalToAnyBase.convertToAnyBase(inp, base);

        // Assert
        assertThat(result).isEqualTo("1010");
    }

    @Test
    public void testReVal() {
        // Arrange
        int num = 15;

        // Act
        char result = DecimalToAnyBase.reVal(num);

        // Assert
        assertThat(result).isEqualTo('F');
    }
}