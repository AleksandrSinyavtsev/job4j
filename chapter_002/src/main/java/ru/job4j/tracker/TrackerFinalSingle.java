package ru.job4j.tracker;

public class TrackerFinalSingle {
    private static final TrackerFinalSingle INSTANCE = new TrackerFinalSingle();

    private TrackerFinalSingle() {
    }

    public static TrackerFinalSingle getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        TrackerFinalSingle tracker = TrackerFinalSingle.getInstance();
    }
}
