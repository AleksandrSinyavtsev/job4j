package ru.job4j.oop;

public class Animal {
    private String name;
    public Animal(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Predator predator = new Predator("Predator");
        Tiger tiger = new Tiger("Tiger");
    }
}
