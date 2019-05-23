package ru.job4j.array;
/**
 * ArrayChar.
 * @author Aleksandr Sinyavtsev (sinyavtsev.alek@yandex.ru).
 * @version $0.1$
 * @since 23.05.2019
 */

public class ArrayChar {

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != wrd[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}