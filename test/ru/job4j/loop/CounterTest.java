package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {
    @Test
    public void when0To10ThenSumEvenIs30() {
        int rsl = Counter.sumByEven(0, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when3To8ThenSumEvenIs18() {
        int rsl = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
    }
    @Test
    public void when1To4ThenSumEvenIs18() {
        int rsl = Counter.sumByEven(1, 4);
        int expected = 6;
        assertThat(rsl, is(expected));
    }
}
