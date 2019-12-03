package ru.job4j.condition;
/**
 *TruckerJob.
 *@author Aleksandr Sinyavtsev (sinyavtsev.alek@yandex.ru)
 *@version $0.1$
 *@since 17.04.2019
 */
public class TruckerJob {
    /**
     * Метод определяющий может ли Стив получить работу водителем.
     * @param args
     */
    public static void main(String[] args) {
        Driver steve = new Driver();
        System.out.println("Steve wants to trucker job.");
        if (!steve.hasLicense()) {
            System.out.println("Steve need to get a license!");
            steve.passExamOn('A');
        }
        if (steve.canDrive('C')) {
            System.out.println("Steve can works on truckers!");
        } else if (steve.canDrive('B')) {
            System.out.println("Steve can works on taxi.");
        } else {
           System.out.println("Steve does not have a job, but ride on motorbike!");
        }
    }
}
