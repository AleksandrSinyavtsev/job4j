package ru.job4j.array;
/*
 *CheckTest.
 *@author Aleksandr Sinyavtsev (sinyavtsev.alek@yandex.ru).
 *@version $Id$
 *@since 23.04.2019
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    /*
    *Test true.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /*
     *Test false.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    /*
     *Test false for even elements.
     */
    @Test
    public void whenDataEvenMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, false, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    /*
     *Test true for not even elements.
     */
    @Test
    public void whenDataEvenMonoByFalseThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[]{false, false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
}