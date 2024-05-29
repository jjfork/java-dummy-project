package org.example.datastructures.crdt;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TwoPSetTests {

    @Test
    public void testLookup() {
        TwoPSet<Integer> twoPSet = new TwoPSet<>();
        twoPSet.add(1);
        assertThat(twoPSet.lookup(1)).isTrue();
    }

    @Test
    public void testAdd() {
        TwoPSet<String> twoPSet = new TwoPSet<>();
        twoPSet.add("test");
        assertThat(twoPSet.lookup("test")).isTrue();
    }

    @Test
    public void testRemove() {
        TwoPSet<String> twoPSet = new TwoPSet<>();
        twoPSet.add("test");
        twoPSet.remove("test");
        assertThat(twoPSet.lookup("test")).isFalse();
    }

    @Test
    public void testCompare() {
        TwoPSet<Integer> twoPSet1 = new TwoPSet<>();
        twoPSet1.add(1);
        TwoPSet<Integer> twoPSet2 = new TwoPSet<>();
        twoPSet2.add(1);
        assertThat(twoPSet1.compare(twoPSet2)).isTrue();
    }

    @Test
    public void testMerge() {
        TwoPSet<String> twoPSet1 = new TwoPSet<>();
        twoPSet1.add("test1");
        TwoPSet<String> twoPSet2 = new TwoPSet<>();
        twoPSet2.add("test2");
        TwoPSet<String> mergedSet = twoPSet1.merge(twoPSet2);
        assertThat(mergedSet.lookup("test1")).isTrue();
        assertThat(mergedSet.lookup("test2")).isTrue();
    }
}
