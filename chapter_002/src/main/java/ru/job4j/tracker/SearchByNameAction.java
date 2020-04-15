package ru.job4j.tracker;

/**
 * @author Alexandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class SearchByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Search for an item by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        for (Item item : items) {
            if (item != null) {
                System.out.println("Name: " + item.getName()+ " "
                        + System.lineSeparator() + "Id: " + item.getId());
            } else {
                System.out.println("Item not found!");
            }
        }
        return true;
    }
}
