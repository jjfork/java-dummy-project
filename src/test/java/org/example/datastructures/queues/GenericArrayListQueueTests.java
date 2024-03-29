package org.example.datastructures.queues;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GenericArrayListQueueTests {

    @Test
    public void testPeek_WhenQueueHasElements_ThenReturnFirstElement() {
        GenericArrayListQueue<Integer> queue = new GenericArrayListQueue<>();
        queue.add(1);
        queue.add(2);
        Integer result = queue.peek();
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testPeek_WhenQueueIsEmpty_ThenReturnNull() {
        GenericArrayListQueue<String> queue = new GenericArrayListQueue<>();
        String result = queue.peek();
        assertThat(result).isNull();
    }

    @Test
    public void testAdd_WhenElementAdded_ThenReturnTrue() {
        GenericArrayListQueue<Double> queue = new GenericArrayListQueue<>();
        boolean result = queue.add(3.14);
        assertThat(result).isTrue();
    }

    @Test
    public void testPull_WhenQueueHasElements_ThenReturnFirstElementAndRemoveIt() {
        GenericArrayListQueue<Integer> queue = new GenericArrayListQueue<>();
        queue.add(5);
        queue.add(10);
        Integer result = queue.pull();
        assertThat(result).isEqualTo(5);
        assertThat(queue.peek()).isEqualTo(10);
    }

    @Test
    public void testPull_WhenQueueIsEmpty_ThenReturnNull() {
        GenericArrayListQueue<String> queue = new GenericArrayListQueue<>();
        String result = queue.pull();
        assertThat(result).isNull();
    }
}