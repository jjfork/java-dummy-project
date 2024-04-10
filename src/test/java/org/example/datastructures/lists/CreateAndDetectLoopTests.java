package org.example.datastructures.lists;

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

@ExtendWith(MockitoExtension.class)
public class CreateAndDetectLoopTests {

    @Test
    void testDetectLoop_NoLoop_ReturnsFalse() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        boolean result = CreateAndDetectLoop.detectLoop(head);

        assertThat(result).isFalse();
    }

    @Test
    void testDetectLoop_WithLoop_ReturnsTrue() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next;

        boolean result = CreateAndDetectLoop.detectLoop(head);

        assertThat(result).isTrue();
    }

    @Test
    void testCreateLoop_ValidInput_CreatesLoop() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        CreateAndDetectLoop.createLoop(head, 2);

        assertThat(CreateAndDetectLoop.detectLoop(head)).isTrue();
    }
}