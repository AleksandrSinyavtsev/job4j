package ru.job4j.oop.strategy;

/**
 * @author Alexandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }
}