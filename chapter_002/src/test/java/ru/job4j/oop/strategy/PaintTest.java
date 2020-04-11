package ru.job4j.oop.strategy;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.StringJoiner;

/**
 * @author Alexandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out; // получаем ссылку на стандартный вывод в консоль.
        ByteArrayOutputStream out = new ByteArrayOutputStream(); // Создаем буфер для хранения вывода.
        System.setOut(new PrintStream(out)); //Заменяем стандартный вывод на вывод в пямять для тестирования.
        new Paint().draw(new Square()); // выполняем действия пишушиее в консоль.
        // проверяем результат вычисления
        assertThat(new String(out.toByteArray()),
                is(new StringJoiner(System.lineSeparator())
                        .add("********")
                        .add("********")
                        .add("********")
                        .add("********")
                        .add(System.lineSeparator())
                        .toString()));
        System.setOut(stdout); // возвращаем обратно стандартный вывод в консоль.
    }
    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(new String(out.toByteArray()),
                is(new StringJoiner(System.lineSeparator())
                        .add("   *   ")
                        .add("  ***  ")
                        .add(" ***** ")
                        .add("*******")
                        .add(System.lineSeparator())
                        .toString()));
        System.setOut(stdout);
    }
}