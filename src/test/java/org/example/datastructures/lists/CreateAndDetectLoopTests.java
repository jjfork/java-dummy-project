package org.example.datastructures.lists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CreateAndDetectLoopTests {

    @Test
    void testPrintList() {
        // TODO: Implement test for printList method
    }

    @Test
    void testCreateLoop() {
        // TODO: Implement test for createLoop method
    }

    @Test
    void testDetectLoop() {
        // Arrange
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // Creating a loop

        // Act
        boolean result = CreateAndDetectLoop.detectLoop(head);

        // Assert
        assertThat(result).isTrue();
    }
}