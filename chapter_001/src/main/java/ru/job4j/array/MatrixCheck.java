package ru.job4j.array;
/**
 *Check.
 *@author Aleksandr Sinyavtsev (sinyavtsev.alek@yandex.ru).
 *@version $0.1$
 *@since 29.05.2019
 */
public class MatrixCheck {
    public boolean mono(boolean[][] input) {
        boolean resalt = true;
        for (int i = 1; i < input.length; i++) {
            if ((input[0][0] != input[i][i]) || (input[input.length - 1][0] != input[input.length - 1 - i][i])) {
                resalt = false;
            }
        }
        return resalt;
    }
}