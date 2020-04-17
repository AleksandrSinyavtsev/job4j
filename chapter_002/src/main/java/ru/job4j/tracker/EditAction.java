package ru.job4j.tracker;

/**
 * @author Alexandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit mode ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String newName = input.askStr("Enter new name: ");
        Item item = new Item(newName);
        item.setId(id);
            if (tracker.replace(id, item)) {
                System.out.println("Item has replaced!");
            } else {
                System.out.println("Item not found!");
            }
        return true;
    }
}
