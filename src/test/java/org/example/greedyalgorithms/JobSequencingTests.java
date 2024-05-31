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
import static org.mockito.Mockito.*;

import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)
public class JobSequencingTests {

    @Test
    public void testFindJobSequence() {
        // Given
        JobSequencing.Job job1 = new JobSequencing.Job('A', 2, 100);
        JobSequencing.Job job2 = new JobSequencing.Job('B', 1, 19);
        JobSequencing.Job job3 = new JobSequencing.Job('C', 2, 27);
        JobSequencing.Job job4 = new JobSequencing.Job('D', 1, 25);
        JobSequencing.Job job5 = new JobSequencing.Job('E', 3, 15);
        ArrayList<JobSequencing.Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
        jobs.add(job4);
        jobs.add(job5);

        // When
        String jobSequence = JobSequencing.findJobSequence(jobs, 5);

        // Then
        assertThat(jobSequence).isEqualTo("Job Sequence: B -> A -> E");
    }
}