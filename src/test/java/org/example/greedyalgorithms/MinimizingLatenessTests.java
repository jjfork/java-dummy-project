package org.example.greedyalgorithms;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
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
    void calculateLateness_WhenNoJobs_ShouldNotThrowException() {
        // Arrange

        // Act
        MinimizingLateness.calculateLateness();

        // Assert
        // No assertion needed as no jobs are provided
    }

    @Test
    void calculateLateness_WhenSingleJob_ShouldCalculateLatenessCorrectly() {
        // Arrange
        MinimizingLateness.Job job = MinimizingLateness.Job.of("Job1", 5, 10);

        // Act
        MinimizingLateness.calculateLateness(job);

        // Assert
        assertThat(job.lateness).isEqualTo(0);
    }

    @Test
    void calculateLateness_WhenMultipleJobs_ShouldCalculateLatenessCorrectly() {
        // Arrange
        MinimizingLateness.Job job1 = MinimizingLateness.Job.of("Job1", 5, 10);
        MinimizingLateness.Job job2 = MinimizingLateness.Job.of("Job2", 3, 8);

        // Act
        MinimizingLateness.calculateLateness(job1, job2);

        // Assert
        assertThat(job1.lateness).isEqualTo(0);
        assertThat(job2.lateness).isEqualTo(0);
    }
}
