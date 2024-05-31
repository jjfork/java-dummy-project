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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CollatzConjectureTests {

    @Test
    public void testNextNumber() {
        CollatzConjecture collatzConjecture = new CollatzConjecture();
        assertThat(collatzConjecture.nextNumber(6)).isEqualTo(3);
    }

    @Test
    public void testCollatzConjecture() {
        CollatzConjecture collatzConjecture = new CollatzConjecture();
        List<Integer> result = collatzConjecture.collatzConjecture(10);
        assertThat(result).containsExactly(10, 5, 16, 8, 4, 2, 1);
    }

    @Test
    public void testCollatzConjectureWithInvalidInput() {
        CollatzConjecture collatzConjecture = new CollatzConjecture();
        assertThrows(IllegalArgumentException.class, () -> collatzConjecture.collatzConjecture(0));
    }
}
