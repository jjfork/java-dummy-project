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

class LWWElementSetTests {

    @Test
    void testAddElement() {
        LWWElementSet lwwElementSet = new LWWElementSet();
        Element element = new Element("test", 1, Bias.ADDS);

        lwwElementSet.add(element);

        assertTrue(lwwElementSet.lookup(element));
    }

    @Test
    void testRemoveElement() {
        LWWElementSet lwwElementSet = new LWWElementSet();
        Element element = new Element("test", 1, Bias.ADDS);

        lwwElementSet.add(element);
        lwwElementSet.remove(element);

        assertFalse(lwwElementSet.lookup(element));
    }

    @Test
    void testMergeSets() {
        LWWElementSet lwwElementSet1 = new LWWElementSet();
        Element element1 = new Element("test1", 1, Bias.ADDS);
        lwwElementSet1.add(element1);

        LWWElementSet lwwElementSet2 = new LWWElementSet();
        Element element2 = new Element("test2", 2, Bias.ADDS);
        lwwElementSet2.add(element2);

        lwwElementSet1.merge(lwwElementSet2);

        assertTrue(lwwElementSet1.lookup(element1));
        assertTrue(lwwElementSet1.lookup(element2));
    }

    @Test
    void testCompareTimestamps() {
        LWWElementSet lwwElementSet = new LWWElementSet();
        Element element1 = new Element("test1", 1, Bias.ADDS);
        Element element2 = new Element("test2", 2, Bias.ADDS);

        assertTrue(lwwElementSet.compareTimestamps(element1, element2));
    }

}