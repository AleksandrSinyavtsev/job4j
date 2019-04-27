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
        Point point = new Point();
        double result = point.distance(0, 0, 0, 10);
        assertThat(result, is(10D));
    }
}
