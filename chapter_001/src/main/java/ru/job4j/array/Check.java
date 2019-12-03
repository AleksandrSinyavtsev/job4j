package ru.job4j.array;
/**
 *Check.
 *@author Aleksandr Sinyavtsev (sinyavtsev.alek@yandex.ru).
 *@version $0.1$
 *@since 23.05.2019
 */
public class Check {
    public boolean mono(boolean[] input) {
        boolean resalt = true;
        boolean temp = input[0];
        for (int i = 1; i < input.length; i++) {
            if (temp != input[i]) {
                resalt = false;
            }
        }
        return resalt;
    }

}