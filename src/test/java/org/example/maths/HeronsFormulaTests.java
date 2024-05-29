package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class HeronsFormulaTests {

    @Test
    public void testHeronsFormula_ValidSides_CalculatesArea() {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        double result = HeronsFormula.herons(a, b, c);

        assertThat(result).isEqualTo(6.0);
    }

    @Test
    public void testHeronsFormula_NegativeSide_ThrowsIllegalArgumentException() {
        double a = -3.0;
        double b = 4.0;
        double c = 5.0;

        assertThrows(IllegalArgumentException.class, () -> HeronsFormula.herons(a, b, c));
    }

    @Test
    public void testHeronsFormula_InvalidTriangle_ThrowsIllegalArgumentException() {
        double a = 1.0;
        double b = 2.0;
        double c = 10.0;

        assertThrows(IllegalArgumentException.class, () -> HeronsFormula.herons(a, b, c));
    }
}
