package ru.job4j.oop.strategy;

import org.junit.After;
import org.junit.Before;
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
    private final PrintStream stdout = System.out; // поле содержит дефолтный вывод в консоль.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream(); // буфер для результата.

    @Before
    public void loadOutput() {
        System.out.println("execute before method"); //заменяем стандартный вывод в
        // консоль выводом в память для теста.
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout); // возвращаем обратно стандартный вывод в консоль.
        System.out.println("execute after method");
    }
    @Test
    public void whenDrawSquare() {
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
    }
    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(new String(out.toByteArray()),
                is(new StringJoiner(System.lineSeparator())
                        .add("   *   ")
                        .add("  ***  ")
                        .add(" ***** ")
                        .add("*******")
                        .add(System.lineSeparator())
                        .toString()));
    }
}