package ru.job4j.tracker;
/**
 * @author Sinyavtsev Aleksandr.
 */

import java.util.Arrays;
import java.util.Random;


@SuppressWarnings("ALL")
public class Tracker {
  private Item[] items = new Item[100];

  /**
   * Указатель ячейки для новой заявки.
   */
  private int position = 0;

  /**
   * Метод реализаущий добавление заявки в хранилище.
   *
   * @param item новая заявка
   */
  public Item add(Item item) {
    item.setId(this.generateId());
    this.items[this.position++] = item;
    return item;
  }

  /**
   * Метод генерирует уникальный ключ для заявки.
   * Так как у заявки нет уникальности полей, имени и описание.
   * Для идентификации нам нужен уникальный ключ.
   *
   * @return Уникальный ключ.
   */
  private String generateId() {
    Random rm = new Random();
    return String.valueOf(rm.nextLong() + System.currentTimeMillis());
  }

  /**
   * должен заменить ячейку в массиве this.items. Для этого необходимо найти ячейку в массиве по id.
   *
   * @param id Уникальный номер заявки.
   * @param item Новая заявка.
   * @return Метод должен вернуть boolean результат - удалось ли провести операцию.
   */
  public boolean replace(String id, Item item) {
    boolean resalt = false;
    for (int index = 0; index < items.length; index++) {
      if (items[index].getId().equals(id)) {
        items[index] = item;
        resalt = true;
        break;
      }
    }
    return resalt;
  }

  /**
   * должен удалить ячейку в массиве this.items.
   * Для этого необходимо найти ячейку в массиве по id.
   * Далее сместить все значения справа от
   * удаляемого элемента - на одну ячейку влево с помощью System.arrayCopy().
   * Метод должен вернуть boolean результат - удалось ли провести операцию.
   *
   * @param id Уникальный номер заявки.
   * @return Метод должен вернуть boolean результат - удалось ли провести операцию.
   */
  public boolean delete(String id) {
    boolean resalt = false;
    for (int out = 0; out < this.position; out++) {
      if (items[out] != null && items[out].getId().equals(id)) {
        items[out] = null;
        System.arraycopy(items, out + 1, this.items, out, this.position - 1);
        resalt = true;
        break;
      }
    }
    return resalt;
  }

  /**
   * Метод public Item[] findAll()
   * возвращает копию массива this.items без null элементов.
   * @return
   */
  public Item[] findAll() {
    int i = 0;
    Item[] resalt = new Item[this.position];
    for (int out = 0; out < this.position; out++) {
      if (this.items[out].getName() != null) {
        resalt[i++] = this.items[out];
      }
    }
    return Arrays.copyOf(this.items, this.position);
  }

  /**
   * проверяет в цикле все элементы массива this.items,
   * сравнивая name (используя метод getName класса Item)
   * с аргументом метода String key. Элементы, у которых совпадает name,
   * копирует в результирующий массив и возвращает его
   *
   * @param key Ключ, который сравнивают с именем.
   * @return Если Item не найден - возвращает null
   */
  public Item[] findByName(String key) {
    int i = 0;
    Item[] resalt = new Item[this.position];
    for (int out = 0; out < this.position; out++) {
      if (this.items[out].getName().equals(key)) {
        resalt[i++] = this.items[out];
      }
    }
    return Arrays.copyOf(resalt, i);
  }

  /**
   * проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id.
   * @param id Уникальный номер заявки.
   * @return возвращает найденный Item.
   */
  public Item findById(String id) {
    Item resalt = null;
    for (int out = 0; out < this.position; out++) {
      if (this.items[out].getId().equals(id)) {
        resalt = this.items[out];
        break;
      }
    }
    return resalt;
  }
}

