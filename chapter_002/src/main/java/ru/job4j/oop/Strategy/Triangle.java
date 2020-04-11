package ru.job4j.oop.Strategy;

import java.util.StringJoiner;

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
