package org.example.datastructures.disjointsetunion;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class NodeTests {

    @Test
    void testNodeInitialization() {
        // Given
        Integer testData = 5;
        
        // When
        Node<Integer> node = new Node<>(testData);
        
        // Then
        assertThat(node.data).isEqualTo(testData);
        assertThat(node.parent).isEqualTo(node);
    }
}
