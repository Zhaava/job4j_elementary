package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("размер массива ages: " + ages.length);
        System.out.println("размер массива surnames: " + surnames.length);
        System.out.println("размер массива prices: " + prices.length);
    }
}
