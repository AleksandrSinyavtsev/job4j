package ru.job4j.tracker;

/**
 * @author Alexandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class CreateAction implements UserAction {
   public String name() {
       return "=== Create a new Item ====";
   }

   @Override
   public boolean execute(Input input, Tracker tracker) {
       String name = input.askStr("Enter name: ");
       Item item = new Item(name);
       tracker.add(item);
       return false;
   }
}
