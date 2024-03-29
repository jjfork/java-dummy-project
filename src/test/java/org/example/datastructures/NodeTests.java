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
        Integer value = 10;
        Node<Integer> node = new Node<>(value);
        assertThat(node.getValue()).isEqualTo(value);
        assertThat(node.getChildren()).isEmpty();
    }

    @Test
    public void testNodeCreationWithValueAndChildren() {
        Integer value = 10;
        List<Node<Integer>> children = new ArrayList<>();
        Node<Integer> child1 = mock(Node.class);
        Node<Integer> child2 = mock(Node.class);
        children.add(child1);
        children.add(child2);
        Node<Integer> node = new Node<>(value, children);
        assertThat(node.getValue()).isEqualTo(value);
        assertThat(node.getChildren()).containsExactly(child1, child2);
    }

    @Test
    public void testAddChild() {
        Node<Integer> node = new Node<>(10);
        Node<Integer> child = mock(Node.class);
        node.addChild(child);
        assertThat(node.getChildren()).contains(child);
    }
}