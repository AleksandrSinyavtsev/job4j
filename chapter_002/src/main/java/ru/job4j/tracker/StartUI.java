package ru.job4j.tracker;


public class StartUI {
  public static void createItem(Input input, Tracker tracker) {
    System.out.println("=== Create a new Item ====");
    System.out.print("Enter name: ");
    String name = input.askStr("");
    Item item = new Item(name);
    tracker.add(item);
  }

  public static void currentItem(Input input, Tracker tracker) {
    System.out.println("=== Current Item ====");
    System.out.println(tracker.findAll());
  }

  public static void editItem(Input input, Tracker tracker) {
    System.out.println("=== Edit mode ====");
    System.out.print("Enter id: ");
    String id = input.askStr("");
    System.out.println(tracker.findById(id));
    System.out.print("Enter new name: ");
    String newName = input.askStr("");
    Item item = new Item(newName);
    tracker.replace(id, item);
    System.out.println("The item successfully changed!!!");
  }

  public static void deleteItem(Input input, Tracker tracker) {
    System.out.println("=== Delete items ====");
    System.out.print("Enter id: ");
    String id = input.askStr("");
    tracker.delete(id);
    System.out.println("The item successfully delete!!!");
  }

  public static void searchById(Input input, Tracker tracker) {
    System.out.println("=== Search for an item by id ====");
    System.out.print("Enter id: ");
    String id = input.askStr("");
    tracker.findById(id);
  }

  public static void searchByName(Input input, Tracker tracker) {
    System.out.println("=== Search for an item by name ====");
    System.out.print("Enter name: ");
    String name = input.askStr("");
    tracker.findByName(name);
  }

  private void init(Input input, Tracker tracker) {
    boolean run = true;
    while (run) {
      this.showMenu();
      System.out.print("Select: ");
      int select = Integer.valueOf(input.askStr(""));
      //Создаем и добавляем в трекер новую заявку.
      if (select == 0) {
        StartUI.createItem(input, tracker);
      } else if (select == 1) { //Выводим список заявок.
        StartUI.currentItem(input, tracker);
      } else if (select == 2) {  //Редактируем заявку.
        StartUI.editItem(input, tracker);
      } else if (select == 3) { //Удаляем заявку.
        StartUI.deleteItem(input, tracker);
      } else if (select == 4) { //Ищем заявку по id.
        StartUI.searchById(input, tracker);
      } else if (select == 5) { //Ищем заявку по имени.
        StartUI.searchByName(input, tracker);
      } else if (select == 6) { //Выход из меню.
        break;
      }
    }
  }


  private void showMenu() { //Вывод списка меню.
    System.out.println("Menu.");
    System.out.println("0. Add new Item");
    System.out.println("1. Show all items");
    System.out.println("2. Edit item");
    System.out.println("3. Delete item");
    System.out.println("4. Find item by Id");
    System.out.println("5. Find items by name");
    System.out.println("6. Exit Program");
  }

  /**
   * Main метод запускающий интерфейс.
   * @param args .
   */
  public static void main(String[] args) {
    Input input = new ConsoleInput();
    Tracker tracker = new Tracker();
    new StartUI().init(input, tracker);
  }
}

