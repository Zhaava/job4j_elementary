package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0;

        for (int k = 0; k < rsl.length; k++) {
            if (j > right.length - 1) {
                rsl[k] = left[i++];
            } else if (i > left.length - 1) {
                rsl[k] = right[j++];
            } else if (left[i] < right[j]) {
                rsl[k] = left[i++];
            } else {
                rsl[k] = right[j++];
            }
        }
        return rsl;
    }
}
