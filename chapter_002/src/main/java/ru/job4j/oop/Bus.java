package ru.job4j.oop;

public class Bus implements Transport {
    @Override
    public void drive() {
    }

    @Override
    public void passengers(int count) {
        int totalSpace = 30;
        int freeSpace = 30 - count;
    }

    @Override
    public double fuelling(double volume) {
        double ai95 = 48;
        return volume * ai95;
    }
}
