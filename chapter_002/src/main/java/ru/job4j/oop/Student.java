package ru.job4j.oop;

/**
 * класс студент
 */
public class Student {
    /**
     * метод music который будет выводить в консоль фразу.
     */
    public void music() {
        System.out.println("Tra tra tra");
    }
    /**
     * метод который выводит в консоль слова песни.
     */
    public void song() {
        System.out.println("I believe I can fly");
    }
    /**
     * метод main который будет выводить данные в консоль
     * с помощью цикла.
     * @param args дефолтный.
     */
    public static void main(String[] args) {
        int i = 0;
        Student petya = new Student();
        while (i < 6) {
            if (i < 3) {
                petya.music();
                i++;
            } else {
                petya.song();
                i++;
            }
        }
    }
}
