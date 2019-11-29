package ru.job4j.oop;

/**
 * класс Jukebox.
 */

public class Jukebox {
    /**
     * метод music который выводит в консоль слова песен
     * делая выбор с помощью ветвления.
     * @param position определяет слова какой песни
     *                 мы выводим в консоль.
     */
    private void music(int position) {
        String resalt = "Песня не найдена";
        if (position == 1) {
            resalt = "Пусть бегут неуклюже";
        }
        if  (position == 2) {
            resalt = "Спят усталые игрушки, книжки спят";
        }
      System.out.println(resalt);
    }
    /**
     * метод проверяющий работу метода music и объекта Jukebox.
     * Будет передавать position в метод music.
     * @param args дефолтный.
     */
    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
    }
}
