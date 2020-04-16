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
        Item theDesiredItem = tracker.findById(id);
        if (theDesiredItem != null) {
            System.out.println("Item ID: " + theDesiredItem.getId() +
                    System.lineSeparator() + "Item name: " + theDesiredItem.getName());
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
