package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test
 *@author Aleksandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 *@version $Id$
 *@since 05.04.2019
 */
public class CalculatorTest  {
    /**
     * Тест сложения
     */
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Тест вычитания
     */
    @Test
    public void whenSubtrackThreeMinusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.subtrack(3D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Тест деления
     */
    @Test
    public void whenDiv2On2Then1() {
        Calculator calc = new Calculator();
        double result = calc.div(2D, 2D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
     * Тест умножения
     */
    @Test
    public void whenMultiple2On2Then4() {
        Calculator calc = new Calculator();
        double result = calc.multiple(2D, 2D);
        double expected = 4D;
        assertThat(result, is(expected));
    }
}
