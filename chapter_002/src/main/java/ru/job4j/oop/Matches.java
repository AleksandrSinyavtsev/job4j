package ru.job4j.oop;

import java.util.Scanner;

/**
 * класс Matches это игра в спички. Правила таковы: на столе лежат 11 спичек.
 * Два игрока по очереди берут от 1 до 3 спичек.
 * Выигрывает тот, кто забрал последние спички.
 */
public class Matches {

    public static void main(String[] args) {
        /**
         * Инициируем переменные-счетчики спичек и попыток.
         */
        int count = 11;
        int attempt = 1;
        String gamer;
        System.out.println("=== Игра начинается! ===");
        while (count > 0) {
            if (attempt % 2 != 0) {
                gamer = "Первый";
            } else {
                gamer = "Второй";
            }
            System.out.println("=== " + gamer + " игрок делает ход! ==="
                    + System.lineSeparator() + "Возьмите от 1 до 3 спичек");
            Scanner input = new Scanner(System.in);
            int select = Integer.valueOf(input.nextLine());
                if (select >= 1 && select <= 3) {
                    count = count - select;
                    attempt++;
                    System.out.println("На столе осталось - " + count);
                } else {
                /**
                * Исключаем вариант когда игрок нарушает правила,
                * и берет либо больше положеного, либо ни одной спички.
                */
                    System.out.println("=== Вы выбрали некорректное количество спичек! ===");
                    System.out.println("=== " + gamer + " игрок делает ход! ==="
                            + System.lineSeparator() + "Возьмите от 1 до 3 спичек");
                    input = new Scanner(System.in);
                    select = Integer.valueOf(input.nextLine());
                        if (select >= 1 && select <= 3) {
                            count = count - select;
                            attempt++;
                            System.out.println("На столе осталось - " + count);
                        }
                    }
            /**
             * Проверяем выигрышное условие и называем победителя.
             */
            if (count <= 0) {
                System.out.println("=== " + gamer + " игрок одержал победу!!! ===");
            }
        }
    }
}
