package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingleTest {
    @Test
    public void singleEnumTested() {
        TrackerSingle enumTracker = TrackerSingle.INSTANCE;
        TrackerSingle newEnumTracker = TrackerSingle.INSTANCE;
        assertEquals(newEnumTracker, enumTracker);
    }
    @Test
    public void singleStaticTested() {
        Tracker staticTracker = TrackerStaticSingle.getInstance();
        Tracker newStaticTracker = TrackerStaticSingle.getInstance();
        assertEquals(staticTracker, newStaticTracker);
    }
    @Test
    public void singleFinalTested() {
        TrackerFinalSingle finalTracker = TrackerFinalSingle.getInstance();
        TrackerFinalSingle newFinalTracker = TrackerFinalSingle.getInstance();
        assertEquals(finalTracker, newFinalTracker);
    }
    @Test
    public void singlePrivateStaticFinalTested() {
        TrackerPrivateStaticFinal privateTracker = TrackerPrivateStaticFinal.getInstance();
        TrackerPrivateStaticFinal newPrivateTracker = TrackerPrivateStaticFinal.getInstance();
        assertEquals(privateTracker, newPrivateTracker);
    }

}