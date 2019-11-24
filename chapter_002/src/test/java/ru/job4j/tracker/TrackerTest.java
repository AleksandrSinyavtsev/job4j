package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;

public class TrackerTest {
    @Test
    public void when2CellsItemsNull() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        tracker.add(test1);
        Item test2 = new Item("test2");
        tracker.add(test2);
        Item[] resalt = tracker.findAll();
        Item[] expect = {test1, test2};
        assertThat(resalt, arrayContainingInAnyOrder(expect));
    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2");
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void deleteItemTest() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("1");
        tracker.add(test1);
        Item test2 = new Item("2");
        tracker.add(test2);
        Item test3 = new Item("3");
        tracker.add(test3);
        boolean resalt = tracker.delete(test3.getId());
        assertThat(resalt, is(true));
    }

    @Test
    public void whenTest1ReplaceOnItem() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        tracker.add(test1);
        Item next = new Item("test2");
        boolean resalt = tracker.replace(test1.getId(), next);
        assertThat(resalt, is(true));
    }
    @Test
    public void whenAnItemsSimilarToAKey() {
        Tracker tracker = new Tracker();
        Item t1 = new Item("test1");
        tracker.add(t1);
        Item t2 = new Item("test2");
        tracker.add(t2);
        Item t3 = new Item("test2");
        tracker.add(t3);
        Item t4 = new Item("test3");
        tracker.add(t4);
        Item t5 = new Item("test1");
        tracker.add(t5);
        Item t6 = new Item("test4");
        tracker.add(t6);
        Item[] resalt = tracker.findByName("test1");
        Item[] expect = {t1, t5};
        assertThat(resalt, arrayContainingInAnyOrder(expect));
    }
}