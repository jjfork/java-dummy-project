package org.example.datastructures;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class NodeTests {

    @Test
    public void testNodeCreation() {
        // Given
        Node<String> node = new Node<>("parent");

        // When
        String value = node.getValue();

        // Then
        assertThat(value).isEqualTo("parent");
    }

    @Test
    public void testAddChild() {
        // Given
        Node<String> parent = new Node<>("parent");
        Node<String> child = new Node<>("child");

        // When
        parent.addChild(child);
        int childrenCount = parent.getChildren().size();

        // Then
        assertThat(childrenCount).isEqualTo(1);
    }

    @Test
    public void testGetChildren() {
        // Given
        Node<String> parent = new Node<>("parent");
        Node<String> child1 = new Node<>("child1");
        Node<String> child2 = new Node<>("child2");
        parent.addChild(child1);
        parent.addChild(child2);

        // When
        int childrenCount = parent.getChildren().size();

        // Then
        assertThat(childrenCount).isEqualTo(2);
    }
}