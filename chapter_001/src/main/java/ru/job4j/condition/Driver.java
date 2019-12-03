package ru.job4j.condition;
/**
 *Driver.
 *@author Aleksandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 *@version $0.1$
 *@since 17.04.2019
 */
public class Driver {
    private char license = 'N';

    /**
     * Метод отправляющий водителя на экзамен если лиензии нет.
     * @param category
     */
    public void passExamOn(char category) {
        this.license = category;
    }

    /**
     * Метод оценивающий есть лицензия или нет.
     * @return
     */
    public boolean hasLicense() {
        return this.license == 'A' || this.license == 'B' || this.license == 'C';
    }

    /**
     * Метод определяющий может ли водитель сесть за руль.
     * @param category
     * @return
     */
    public boolean canDrive(char category) {
        return this.license == category;
    }
}
