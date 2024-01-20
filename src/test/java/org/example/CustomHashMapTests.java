package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import java.util.Map.Entry;

@ExtendWith(MockitoExtension.class)
public class CustomHashMapTests {

    @Mock
    Entry<String, Integer> entryMock;

    @InjectMocks
    CustomHashMap<String, Integer> customHashMap;

    @Test
    public void testPut() {
        when(entryMock.getKey()).thenReturn("key");
        when(entryMock.getValue()).thenReturn(1);
        assertThat(customHashMap.put("key", 1)).isNull();
        verify(entryMock, times(1)).setValue(1);
    }

    @Test
    public void testGet() {
        when(entryMock.getKey()).thenReturn("key");
        when(entryMock.getValue()).thenReturn(1);
        customHashMap.put("key", 1);
        assertThat(customHashMap.get("key")).isEqualTo(1);
    }

    @Test
    public void testRemove() {
        when(entryMock.getKey()).thenReturn("key");
        when(entryMock.getValue()).thenReturn(1);
        customHashMap.put("key", 1);
        assertThat(customHashMap.remove("key")).isEqualTo(1);
        verify(entryMock, times(1)).getKey();
    }

    @Test
    public void testKeySet() {
        when(entryMock.getKey()).thenReturn("key");
        customHashMap.put("key", 1);
        assertThat(customHashMap.keySet()).contains("key");
    }
}