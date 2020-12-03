package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == data[0]) {
                count++;
            }
        }
        return (count == data.length) ? true : false;
    }
}
