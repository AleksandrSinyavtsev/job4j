package ru.job4j.oop;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    /**
     * класс "Предсказатель", имитирует игрушку Magic ball.
     * @param args дефолтный.
     */
    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
            String question = scan.nextLine();
            if (!question.equals("exit")) {
                String[] answers = {"Да", "Нет", "Может быть"};
                int ans = new Random().nextInt(3);
                System.out.println("Ответ на ваш вопрос: " + question + " - " + answers[ans]);
            } else {
                break;
            }
        }
    }
}
