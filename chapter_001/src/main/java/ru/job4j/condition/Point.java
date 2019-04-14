package ru.job4j.condition;

/**
 *Point.
 *@author Aleksandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 *@version $0.1$
 *@since 13.04.2019
 */
@SuppressWarnings("ALL")
public class Point {
     /**
     * Метод для определения расстояния между точками.
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return distance.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
