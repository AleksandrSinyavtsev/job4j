package ru.job4j.tracker;

/**
 * @author Alexandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class SearchByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Search for an item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        if (id != null) {
            System.out.format("Item ID: %s\n", tracker.findById(id).getId());
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
