package ru.job4j.tracker;

public enum TrackerSingle {
    INSTANCE(new Tracker());

    public Tracker tracker;

    TrackerSingle(Tracker tracker) {
        this.tracker = tracker;
    }
}
