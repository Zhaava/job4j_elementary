package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To3Then3() {
        int result = Max.max(1, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To3To6Then6() {
        int result = Max.max(1, 3, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax1To3To5To7Then7() {
        int result = Max.max(1, 3, 5, 7);
        assertThat(result, is(7));
    }
}
