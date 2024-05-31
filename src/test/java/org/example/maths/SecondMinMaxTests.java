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
    public void testFindSecondMinWithNegativeNumbers() {
        int[] arr = {-3, -1, -4, -2};
        int result = SecondMinMax.findSecondMin(arr);
        assertThat(result).isEqualTo(-3);
    }

    @Test
    public void testFindSecondMaxWithNegativeNumbers() {
        int[] arr = {-3, -1, -4, -2};
        int result = SecondMinMax.findSecondMax(arr);
        assertThat(result).isEqualTo(-2);
    }

    @Test
    public void testFindSecondMinWithDuplicates() {
        int[] arr = {3, 1, 4, 2, 2};
        int result = SecondMinMax.findSecondMin(arr);
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void testFindSecondMaxWithDuplicates() {
        int[] arr = {3, 1, 4, 2, 2};
        int result = SecondMinMax.findSecondMax(arr);
        assertThat(result).isEqualTo(3);
    }
}
