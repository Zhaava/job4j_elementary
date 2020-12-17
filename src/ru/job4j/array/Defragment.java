package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index;
                for (int notNullIndex = nullIndex; notNullIndex < array.length; notNullIndex++) {
                    if (array[notNullIndex] != null) {
                        swap(array, nullIndex, notNullIndex);
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static String[] swap(String[] array, int source, int  dest) {
        String temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }
}
