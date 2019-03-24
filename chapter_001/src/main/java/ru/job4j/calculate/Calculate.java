/**
* Package for calculate task.
*
* @author Aleksandr Sinyavtsev (parsentev@yandex.ru)
* @version $Id$
* @since 23.03.2019
*/
package ru.job4j.calculate;
/**
*Class класс для вывода строки aah aah aah
*@author Aleksandr Sinyavtsev
*@since 23.03.2019
*/
public class Calculate {
/**
*Метод для тестирования.
*@param value строка для вывода в консоль
*@return String value.
*/
	public String echo(String value) {
		return String.format("%s %s %s", value, value, value);
	}
	public static void main(String[] args) {
		Calculate calc = new Calculate();
		System.out.println(calc.echo("aah"));
	}
}
