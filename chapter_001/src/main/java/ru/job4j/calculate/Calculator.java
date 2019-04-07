package ru.job4j.calculate;
/**
 *Calculator.
 *@author Aleksandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 *@version $0.1$
 *@since 05.04.2019
 */
public class Calculator {
    /**
     * Метод сложения.
     * @param first double
     * @param second double
     * @return сумма.
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Метод вычитания.
     * @param first double
     * @param second double
     * @return разница.
     */
    public double subtrack(double first, double second) {
        return  first - second;
    }

    /**
     * Метод деления.
     * @param first double
     * @param second double
     * @return отношение.
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     * Метод умножения.
     * @param first double
     * @param second double
     * @return произведение.
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}
