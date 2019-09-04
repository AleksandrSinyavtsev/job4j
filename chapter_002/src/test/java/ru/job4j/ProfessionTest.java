package ru.job4j;

import org.junit.Test;
import ru.job4j.specialization.Builder;
import ru.job4j.specialization.Dantist;
import ru.job4j.specialization.Programmer;
import ru.job4j.specialization.Surgeon;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfessionTest {
    @Test
    public void surgeonGetOperation() {
        Surgeon sur = new Surgeon("Ivan", "Ivanov", "Medical university", "01.01.1980", "appendicitis", "Cut appendicitis");
        String result = sur.getOperation();
        assertThat(result, is("Cut appendicitis"));
    }
    @Test
    public void dantistGetName() {
        Dantist dan = new Dantist("Ivan", "Ivanov", "Medical university", "01.01.1980", "Tooth pain", "Caries treatment");
        String result = dan.getName();
        assertThat(result, is("Ivan"));
    }
    @Test
    public void builderGetEducation() {
        Builder build = new Builder("Ivan", "Ivanov", "University of Civil Engineering", "01.01.1980", "House plan", "Building house");
        String result = build.getEducation();
        assertThat(result, is("University of Civil Engineering"));
    }
    @Test
    public void programmerGetBirthday() {
        Programmer prog = new Programmer("Ivan", "Ivanov", "IT university", "01.01.1980", "Smart Home", "Lighting control program");
        String result = prog.getBirthday();
        assertThat(result, is("01.01.1980"));
    }
}
