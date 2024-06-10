package org.example.datastructures.bloomfilter;

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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BloomFilterTests {

    @Test
    public void testInsert() {
        BloomFilter<String> bloomFilter = new BloomFilter<>(3, 10);
        bloomFilter.insert("test");
        assertThat(bloomFilter.contains("test")).isTrue();
    }

    @Test
    public void testContains() {
        BloomFilter<String> bloomFilter = new BloomFilter<>(3, 10);
        bloomFilter.insert("test");
        assertThat(bloomFilter.contains("test")).isTrue();
        assertThat(bloomFilter.contains("hello")).isFalse();
    }

    @Test
    public void testInsertMultiple() {
        BloomFilter<String> bloomFilter = new BloomFilter<>(3, 10);
        bloomFilter.insert("test");
        bloomFilter.insert("hello");
        assertThat(bloomFilter.contains("test")).isTrue();
        assertThat(bloomFilter.contains("hello")).isTrue();
    }

    @Test
    public void testContainsFalsePositive() {
        BloomFilter<String> bloomFilter = new BloomFilter<>(3, 10);
        bloomFilter.insert("test");
        assertThat(bloomFilter.contains("hello")).isFalse();
    }
}
