package ru.job4j.oop;

/**
 * класс описывает поведение батарейки.
 */
public class Battery {
    private int capacity;

    public Battery(int charge) {
        this.capacity = charge;
    }
    /**
     * метод разряда батарейки
     * @param another потребитель энергии.
     */
    public void exchange(Battery another) {
        another.capacity = this.capacity + another.capacity;
        this.capacity = 0;
    }
    public static void main(String[] args) {
       Battery first = new Battery(10);
       Battery second = new Battery(4);
       System.out.println("first : " + first.capacity + ". second : " + second.capacity);
       first.exchange(second);
       System.out.println("first : " + first.capacity + ". second : " + second.capacity);
    }
}

