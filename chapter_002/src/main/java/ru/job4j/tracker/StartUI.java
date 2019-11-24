package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
  private void init(Scanner scanner, Tracker tracker) {
    boolean run = true;
    while (run) {
      this.showMenu();
      System.out.print("Select: ");
      int select = Integer.valueOf(scanner.nextLine());
      //Создаем и добавляем в трекер новую заявку.
      if (select == 0) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Item item = new Item(name);
        tracker.add(item);
      } else if (select == 1) { //Выводим список заявок.
        System.out.println("=== Current Item ====");
        System.out.println(tracker.findAll());
      } else if (select == 2) {  //Редактируем заявку.
        System.out.println("=== Edit mode ====");
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        System.out.println(tracker.findById(id));
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        Item item = new Item(newName);
        tracker.replace(id, item);
        System.out.println("The item successfully changed!!!");
      } else if (select == 3) { //Удаляем заявку.
        System.out.println("=== Delete items ====");
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        tracker.delete(id);
        System.out.println("The item successfully delete!!!");
      } else if (select == 4) { //Ищем заявку по id.
        System.out.println("=== Search for an item by id ====");
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        tracker.findById(id);
      } else if (select == 5) { //Ищем заявку по имени.
        System.out.println("=== Search for an item by name ====");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        tracker.findByName(name);
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
    Scanner scanner = new Scanner(System.in);
    Tracker tracker = new Tracker();
    new StartUI().init(scanner, tracker);
  }
}

