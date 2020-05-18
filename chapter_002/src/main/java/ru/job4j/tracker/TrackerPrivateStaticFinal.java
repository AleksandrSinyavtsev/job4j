package ru.job4j.tracker;

public class TrackerPrivateStaticFinal {
    private TrackerPrivateStaticFinal() {
    }

    public static TrackerPrivateStaticFinal getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerPrivateStaticFinal INSTANCE = new TrackerPrivateStaticFinal();
    }

    public static void main(String[] args) {
        TrackerPrivateStaticFinal tracker = TrackerPrivateStaticFinal.getInstance();
    }
}
