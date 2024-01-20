package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.EnumMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CustomEnumMapTests {

    @Test
    public void testEntrySet() {
        // Arrange
        CustomEnumMap<TestEnum, String> customEnumMap = new CustomEnumMap<>(TestEnum.class);

        // Act
        EnumMap<TestEnum, String> enumMap = new EnumMap<>(TestEnum.class);
        enumMap.put(TestEnum.VALUE1, "Value 1");
        enumMap.put(TestEnum.VALUE2, "Value 2");
        customEnumMap.put(TestEnum.VALUE1, "Value 1");
        customEnumMap.put(TestEnum.VALUE2, "Value 2");

        // Assert
        assertThat(customEnumMap.entrySet()).hasSize(2);
    }

    @Test
    public void testGet() {
        // Arrange
        CustomEnumMap<TestEnum, String> customEnumMap = new CustomEnumMap<>(TestEnum.class);
        customEnumMap.put(TestEnum.VALUE1, "Value 1");

        // Act
        String value = customEnumMap.get(TestEnum.VALUE1);

        // Assert
        assertThat(value).isEqualTo("Value 1");
    }

    @Test
    public void testPut() {
        // Arrange
        CustomEnumMap<TestEnum, String> customEnumMap = new CustomEnumMap<>(TestEnum.class);

        // Act
        customEnumMap.put(TestEnum.VALUE1, "Value 1");

        // Assert
        assertThat(customEnumMap.get(TestEnum.VALUE1)).isEqualTo("Value 1");
    }

    @Test
    public void testRemove() {
        // Arrange
        CustomEnumMap<TestEnum, String> customEnumMap = new CustomEnumMap<>(TestEnum.class);
        customEnumMap.put(TestEnum.VALUE1, "Value 1");

        // Act
        String removedValue = customEnumMap.remove(TestEnum.VALUE1);

        // Assert
        assertThat(removedValue).isEqualTo("Value 1");
        assertThat(customEnumMap.get(TestEnum.VALUE1)).isNull();
    }

    @Test
    public void testClear() {
        // Arrange
        CustomEnumMap<TestEnum, String> customEnumMap = new CustomEnumMap<>(TestEnum.class);
        customEnumMap.put(TestEnum.VALUE