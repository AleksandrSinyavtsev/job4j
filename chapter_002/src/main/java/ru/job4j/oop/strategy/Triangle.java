package ru.job4j.oop.strategy;

import java.util.StringJoiner;

/**
 * @author Alexandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class Triangle implements Shape {
   public String draw() {
       StringJoiner pic = new StringJoiner(System.lineSeparator());
       pic.add("   *   ");
       pic.add("  ***  ");
       pic.add(" ***** ");
       pic.add("*******");
       pic.add(System.lineSeparator());
       return pic.toString();
   }
}
