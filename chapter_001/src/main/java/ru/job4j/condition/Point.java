package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 *Point.
 *@author Aleksandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 *@version $0.1$
 *@since 13.04.2019
 */
@SuppressWarnings("ALL")
public class Point {

    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
     /**
     * Метод для определения расстояния между точками.
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return distance.
     */
     public double distance(Point that) {
         return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
     }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
