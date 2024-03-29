package org.example.datastructures.lists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ReverseKGroupTests {

    @Test
    public void testReverseKGroup_whenListIsNull_thenReturnNull() {
        ReverseKGroup reverseKGroup = new ReverseKGroup();
        Node head = null;
        int k = 3;

        Node result = reverseKGroup.reverseKGroup(head, k);

        assertThat(result).isNull();
    }

    @Test
    public void testReverseKGroup_whenListHasLessThanKNodes_thenReturnOriginalList() {
        ReverseKGroup reverseKGroup = new ReverseKGroup();
        Node head = new Node(1);
        head.next = new Node(2);
        int k = 3;

        Node result = reverseKGroup.reverseKGroup(head, k);

        assertThat(result).isEqualTo(head);
    }

    @Test
    public void testReverseKGroup_whenListHasKNodes_thenReturnReversedList() {
        ReverseKGroup reverseKGroup = new ReverseKGroup();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        int k = 2;

        Node result = reverseKGroup.reverseKGroup(head, k);

        assertThat(result.value).isEqualTo(2);
        assertThat(result.next.value).isEqualTo(1);
        assertThat(result.next.next.value).isEqualTo(3);
    }
}