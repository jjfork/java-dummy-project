package org.example.greedyalgorithms;

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
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class MinimizingLatenessTests {

    @Test
    void testCalculateLateness() {
        MinimizingLateness.Job job1 = MinimizingLateness.Job.of("Job1", 3, 5);
        MinimizingLateness.Job job2 = MinimizingLateness.Job.of("Job2", 2, 4);
        MinimizingLateness.Job job3 = MinimizingLateness.Job.of("Job3", 4, 7);

        MinimizingLateness.calculateLateness(job1, job2, job3);

        assertThat(job1.lateness).isEqualTo(0);
        assertThat(job2.lateness).isEqualTo(0);
        assertThat(job3.lateness).isEqualTo(2);
    }
}