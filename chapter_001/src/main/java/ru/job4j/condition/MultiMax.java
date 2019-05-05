package ru.job4j.condition;
/**
 *MultiMax.
 *@author Aleksandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 *@version $0.1$
 *@since 03.05.2019
 */
public class MultiMax {
    public int max(int first, int second, int third) {
        int result = (first > second) ? first : second;
        return (result > third) ? result : third;
    }
}
