package ru.job4j.tracker;

/**
 * @author Alexandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public interface Input {
    String askStr(String question);
    int askInt(String question);
    int askInt(String question, int max);
}
