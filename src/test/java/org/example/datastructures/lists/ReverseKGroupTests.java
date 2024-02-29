package org.example.datastructures.lists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ReverseKGroupTests {

    @Test
    public void testReverseKGroup() {
        // Arrange
        ReverseKGroup reverseKGroup = new ReverseKGroup();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        int k = 2;

        // Act
        Node result = reverseKGroup.reverseKGroup(head, k);

        // Assert
        assertThat(result).isNotNull();
        assertThat(result.value).isEqualTo(2);
        assertThat(result.next.value).isEqualTo(1);
        assertThat(result.next.next.value).isEqualTo(4);
        assertThat(result.next.next.next.value).isEqualTo(3);
    }

    @Test
    public void testReverseKGroup_WhenKIsGreaterThanLength() {
        // Arrange
        ReverseKGroup reverseKGroup = new ReverseKGroup();
        Node head = new Node(1);
        head.next = new Node(2);
        int k = 3;

        // Act
        Node result = reverseKGroup.reverseKGroup(head, k);

        // Assert
        assertThat(result).isNotNull();
        assertThat(result.value).isEqualTo(1);
        assertThat(result.next.value).isEqualTo(2);
    }
}