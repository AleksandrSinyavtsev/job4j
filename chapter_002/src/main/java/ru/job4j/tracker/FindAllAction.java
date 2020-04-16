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
        int number = 1;
        Item[] result = tracker.findAll();
        for(Item item : result) {
            System.out.println("#" + number + ". " + item);
            number++;
        }
        return true;
    }
}
