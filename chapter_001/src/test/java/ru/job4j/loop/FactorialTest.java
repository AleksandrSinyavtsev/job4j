package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
   @Test
    public  void whenN5Factorial120() {
       Factorial f = new Factorial();
        int resalt = f.calc(5);
        assertThat(resalt, is(120));
    }
    @Test
    public void whenN0Factorial1() {
       Factorial f = new Factorial();
       int resalt = f.calc(0);
       assertThat(resalt, is(1));
    }
    @Test
    public  void whenNNegativeFactorialNotExist() {
       Factorial f = new Factorial();
       int resalt = f.calc(-1);
       assertThat(resalt, is(-1));
    }
}
