package ru.job4j.tracker;

/**
 * @author Alexandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class FindAllAction implements UserAction {
    public String name() {
        return "=== Current Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(tracker.findAll());
        return true;
    }
}
