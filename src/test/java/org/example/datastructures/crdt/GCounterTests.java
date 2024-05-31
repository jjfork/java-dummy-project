package org.example.datastructures.crdt;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class GCounterTests {

    @Test
    void testIncrement() {
        GCounter gCounter = new GCounter(1, 5);
        gCounter.increment();
        assertEquals(1, gCounter.value());
    }

    @Test
    void testValue() {
        GCounter gCounter = new GCounter(2, 5);
        assertEquals(0, gCounter.value());
    }

    @Test
    void testCompare() {
        GCounter gCounter1 = new GCounter(1, 3);
        GCounter gCounter2 = new GCounter(2, 3);
        gCounter1.increment();
        assertFalse(gCounter1.compare(gCounter2));
    }

    @Test
    void testMerge() {
        GCounter gCounter1 = new GCounter(1, 3);
        GCounter gCounter2 = new GCounter(2, 3);
        gCounter1.increment();
        gCounter2.increment();
        gCounter1.merge(gCounter2);
        assertEquals(2, gCounter1.value());
    }
}