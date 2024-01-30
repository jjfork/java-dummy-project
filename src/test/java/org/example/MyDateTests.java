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
        MyDate myDate1 = new MyDate(2022, 10, 15);
        MyDate myDate2 = new MyDate(2022, 10, 20);
        assertThat(myDate2.after(myDate1)).isTrue();
    }

    @Test
    public void testBefore() {
        MyDate myDate1 = new MyDate(2022, 10, 15);
        MyDate myDate2 = new MyDate(2022, 10, 20);
        assertThat(myDate1.before(myDate2)).isTrue();
    }

    @Test
    public void testCompareTo() {
        MyDate myDate1 = new MyDate(2022, 10, 15);
        MyDate myDate2 = new MyDate(2022, 10, 20);
        assertThat(myDate1.compareTo(myDate2)).isEqualTo(-1);
    }

    @Test
    public void testGetTime() {
        MyDate myDate = new MyDate(2022, 10, 15);
        assertThat(myDate.getTime()).isNotEqualTo(0);
    }

    @Test
    public void testSetTime() {
        MyDate myDate = new MyDate(2022, 10, 15);
        myDate.setTime(1634236800000L);
        assertThat(myDate.getTime()).isEqualTo(1634236800000L);
    }
}