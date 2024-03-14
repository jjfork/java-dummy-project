package org.example.datastructures.disjointsetunion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class NodeTests {

    @Test
    public void testNodeInitialization() {
        // Given
        Integer testData = 5;
        
        // When
        Node<Integer> node = new Node<>(testData);
        
        // Then
        assertThat(node.data).isEqualTo(testData);
        assertThat(node.parent).isEqualTo(node);
    }
}