package ru.job4j.oop;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class DummyDicTest {
    @Test
    public void whenWordUnknow() {
        DummyDic dum = new DummyDic();
        String result = dum.engToRus("unknow");
        assertThat(result, is("Неизвестное слово. unknow"));
    }
}
