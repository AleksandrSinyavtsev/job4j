package ru.job4j.tracker;

/**
 * @author Alexandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        tracker.delete(id);
        if (tracker.delete(id)) {
            System.out.println("Item has deleted!");
        } else {
            System.out.println("Invalid id!");
        }
        return true;
    }
}
