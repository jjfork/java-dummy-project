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

@ExtendWith(MockitoExtension.class)
public class SecondMinMaxTests {

    @Test
    public void testFindSecondMin() {
        int[] arr = {3, 1, 4, 2};
        int result = SecondMinMax.findSecondMin(arr);
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void testFindSecondMax() {
        int[] arr = {3, 1, 4, 2};
        int result = SecondMinMax.findSecondMax(arr);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void testFindSecondMinWithLessThanTwoElements() {
        int[] arr = {1};
        assertThrows(IllegalArgumentException.class, () -> SecondMinMax.findSecondMin(arr));
    }

    @Test
    public void testFindSecondMaxWithLessThanTwoElements() {
        int[] arr = {1};
        assertThrows(IllegalArgumentException.class, () -> SecondMinMax.findSecondMax(arr));
    }

    @Test
    public void testFindSecondMinWithSameElements() {
        int[] arr = {1, 1, 1};
        assertThrows(IllegalArgumentException.class, () -> SecondMinMax.findSecondMin(arr));
    }

    @Test
    public void testFindSecondMaxWithSameElements() {
        int[] arr = {1, 1, 1};
        assertThrows(IllegalArgumentException.class, () -> SecondMinMax.findSecondMax(arr));
    }
}