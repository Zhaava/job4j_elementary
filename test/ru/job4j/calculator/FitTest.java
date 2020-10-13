package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan170Then80() {
        short in = 170;
        double expected = 80.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenWoman160Then57() {
        short in = 160;
        double expected = 57.4;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenWoman150Then46() {
        short in = 150;
        double expected = 46;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }
}