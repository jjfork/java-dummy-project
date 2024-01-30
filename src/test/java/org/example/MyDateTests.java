package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class MyDateTests {

    @Test
    public void testAfter() {
        MyDate date1 = new MyDate(2022, 10, 15);
        MyDate date2 = new MyDate(2022, 10, 10);
        assertThat(date1.after(date2)).isTrue();
    }

    @Test
    public void testBefore() {
        MyDate date1 = new MyDate(2022, 10, 10);
        MyDate date2 = new MyDate(2022, 10, 15);
        assertThat(date1.before(date2)).isTrue();
    }

    @Test
    public void testCompareTo() {
        MyDate date1 = new MyDate(2022, 10, 10);
        MyDate date2 = new MyDate(2022, 10, 10);
        assertThat(date1.compareTo(date2)).isEqualTo(0);
    }

    @Test
    public void testGetTime() {
        MyDate date = new MyDate(2022, 10, 10);
        assertThat(date.getTime()).isNotEqualTo(0);
    }

    @Test
    public void testSetTime() {
        MyDate date = new MyDate(2022, 10, 10);
        date.setTime(1634160000000L);
        assertThat(date.getTime()).isEqualTo(1634160000000L);
    }
}