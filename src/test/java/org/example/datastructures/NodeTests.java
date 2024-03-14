package org.example.datastructures;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class NodeTests {

    @Test
    public void testNodeCreationWithValue() {
        // Arrange
        Integer value = 10;

        // Act
        Node<Integer> node = new Node<>(value);

        // Assert
        assertThat(node.getValue()).isEqualTo(value);
        assertThat(node.getChildren()).isEmpty();
    }

    @Test
    public void testNodeCreationWithValueAndChildren() {
        // Arrange
        Integer value = 10;
        List<Node<Integer>> children = new ArrayList<>();
        children.add(mock(Node.class));

        // Act
        Node<Integer> node = new Node<>(value, children);

        // Assert
        assertThat(node.getValue()).isEqualTo(value);
        assertThat(node.getChildren()).hasSize(1);
    }

    @Test
    public void testAddChild() {
        // Arrange
        Node<Integer> node = new Node<>(10);
        Node<Integer> child = mock(Node.class);

        // Act
        node.addChild(child);

        // Assert
        assertThat(node.getChildren()).contains(child);
    }
}