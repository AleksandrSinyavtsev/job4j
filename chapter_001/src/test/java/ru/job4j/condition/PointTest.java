package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import static org.hamcrest.number.IsCloseTo.closeTo;

public class PointTest {
    /**
     * Тест определения расстояния.
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point point = new Point(0, 0);
        double result = point.distance(new Point(0, 10));
        assertThat(result, is(10D));
    }
    @Test
    public void distance3DTest() {
        Point point = new Point(0, 0, 0);
        double result = point.distance3d(new Point(0, 10, 0));
        assertThat(result, is(10D));
    }
}
