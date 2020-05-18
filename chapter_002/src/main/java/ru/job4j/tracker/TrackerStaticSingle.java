package ru.job4j.tracker;

public class TrackerStaticSingle {
    private static Tracker instance;

    private TrackerStaticSingle() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }
}
