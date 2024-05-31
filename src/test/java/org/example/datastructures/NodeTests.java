package org.example.datastructures;

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

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class NodeTests {

    @Test
    public void testNodeCreation() {
        Node<String> node = new Node<>("value");
        assertThat(node.getValue()).isEqualTo("value");
        assertThat(node.getChildren()).isEmpty();
    }

    @Test
    public void testAddChild() {
        Node<String> node = new Node<>("parent");
        Node<String> child = new Node<>("child");
        node.addChild(child);
        assertThat(node.getChildren()).contains(child);
    }

    @Test
    public void testNodeWithChildren() {
        Node<String> child1 = new Node<>("child1");
        Node<String> child2 = new Node<>("child2");
        List<Node<String>> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        Node<String> node = new Node<>("parent", children);
        assertThat(node.getChildren()).contains(child1, child2);
    }
}
