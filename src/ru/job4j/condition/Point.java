package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result2 = Point.distance(2, 8, 1, 6);
        System.out.println("result (2, 8) to (1, 6) " + result2);

        double result3 = Point.distance(0, 3, 2, 10);
        System.out.println("result (0, 3) to (2, 10) " + result3);
    }
}
