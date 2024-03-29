package org.example.greedyalgorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class MinimizingLatenessTests {

    @Test
    void calculateLateness_WhenNoJob_ShouldNotThrowException() {
        assertThatCode(() -> MinimizingLateness.calculateLateness()).doesNotThrowAnyException();
    }

    @Test
    void calculateLateness_WhenSingleJob_ShouldSetStartTimeAndLateness() {
        MinimizingLateness.Job job = MinimizingLateness.Job.of("Job1", 5, 10);
        MinimizingLateness.calculateLateness(job);
        assertThat(job.startTime).isNotNull();
        assertThat(job.lateness).isNotNull();
    }

    @Test
    void calculateLateness_WhenMultipleJobs_ShouldSetStartTimeAndLateness() {
        MinimizingLateness.Job job1 = MinimizingLateness.Job.of("Job1", 5, 10);
        MinimizingLateness.Job job2 = MinimizingLateness.Job.of("Job2", 3, 8);
        MinimizingLateness.calculateLateness(job1, job2);
        assertThat(job1.startTime).isNotNull();
        assertThat(job1.lateness).isNotNull();
        assertThat(job2.startTime).isNotNull();
        assertThat(job2.lateness).isNotNull();
    }
}