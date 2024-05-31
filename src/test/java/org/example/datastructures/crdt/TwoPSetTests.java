package org.example.datastructures.crdt;

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

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

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
        TwoPSet<Integer> twoPSet = new TwoPSet<>();
        twoPSet.add(2);
        twoPSet.remove(2);
        assertThat(twoPSet.lookup(2)).isFalse();
    }

    @Test
    public void testCompare() {
        TwoPSet<Integer> twoPSet1 = new TwoPSet<>();
        twoPSet1.add(1);
        twoPSet1.add(2);

        TwoPSet<Integer> twoPSet2 = new TwoPSet<>();
        twoPSet2.add(1);
        twoPSet2.add(2);

        assertThat(twoPSet1.compare(twoPSet2)).isTrue();
    }

    @Test
    public void testMerge() {
        TwoPSet<String> twoPSet1 = new TwoPSet<>();
        twoPSet1.add("a");
        twoPSet1.add("b");

        TwoPSet<String> twoPSet2 = new TwoPSet<>();
        twoPSet2.add("b");
        twoPSet2.add("c");

        TwoPSet<String> mergedSet = twoPSet1.merge(twoPSet2);

        assertThat(mergedSet.lookup("a")).isTrue();
        assertThat(mergedSet.lookup("b")).isTrue();
        assertThat(mergedSet.lookup("c")).isTrue();
    }
}
