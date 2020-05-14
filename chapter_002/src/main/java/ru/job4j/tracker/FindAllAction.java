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
        for (Item item : tracker.findAll()) {
            System.out.println("#" + number + ". " + item.getName() + " id: " + item.getId());
            number++;
        }
        return true;
    }
}
