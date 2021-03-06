package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test
 *@author Aleksandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 *@version $0.1$
 *@since 24.03.2019
 */
public class CalculateTest {
	/**
	 *Test echo.
	 */
	@Test
	public void whenTakeNameThenThreeEchoPlusName() {
		String input = "Aleksandr Sinyavtsev";
		String expect = "Echo, echo, echo : Aleksandr Sinyavtsev";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
}

