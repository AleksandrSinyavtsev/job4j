package ru.job4j.oop.Strategy;

/**
 * @author Alexandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
    public static void main(String[] args) {
        Paint p = new Paint();
        Triangle t = new Triangle();
        Square s = new Square();
        p.draw(t);
        p.draw(s);
    }
}