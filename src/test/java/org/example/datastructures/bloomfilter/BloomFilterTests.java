package org.example.datastructures.bloomfilter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BloomFilterTests {

    @Test
    public void testInsert() {
        // Arrange
        BloomFilter<String> bloomFilter = new BloomFilter<>(3, 10);

        // Act
        bloomFilter.insert("test");

        // Assert
        assertThat(bloomFilter.contains("test")).isTrue();
    }

    @Test
    public void testContains() {
        // Arrange
        BloomFilter<String> bloomFilter = new BloomFilter<>(3, 10);
        bloomFilter.insert("test");

        // Act
        boolean result = bloomFilter.contains("test");

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void testContains_NotPresent() {
        // Arrange
        BloomFilter<String> bloomFilter = new BloomFilter<>(3, 10);

        // Act
        boolean result = bloomFilter.contains("test");

        // Assert
        assertThat(result).isFalse();
    }
}