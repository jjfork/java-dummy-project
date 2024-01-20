package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyCalendarTests {

    @Test
    public void testGetYear() {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.setYear(2022);
        assertThat(myCalendar.getYear()).isEqualTo(2022);
    }

    @Test
    public void testGetMonth() {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.setMonth(5);
        assertThat(myCalendar.getMonth()).isEqualTo(5);
    }

    @Test
    public void testGetDate() {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.setDate(15);
        assertThat(myCalendar.getDate()).isEqualTo(15);
    }

    @Test
    public void testSetYear() {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.setYear(2022);
        assertThat(myCalendar.getYear()).isEqualTo(2022);
    }

    @Test
    public void testSetMonth() {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.setMonth(5);
        assertThat(myCalendar.getMonth()).isEqualTo(5);
    }

    @Test
    public void testSetDate() {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.setDate(15);
        assertThat(myCalendar.getDate()).isEqualTo(15);
    }

    @Test
    public void testAddYear() {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.setTime(0);
        myCalendar.addYear(1);
        assertThat(myCalendar.getTime()).isEqualTo(31536000000L);
    }

    @Test
    public void testAddMonth() {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.setTime(0);
        myCalendar.addMonth(1);
        assertThat(myCalendar.getTime()).isEqualTo(2592000000L);
    }

    @Test
    public void testAddDate() {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.setTime(0);
        myCalendar.addDate(1);
        assertThat(myCalendar.getTime()).isEqualTo(86400000L);
    }
}