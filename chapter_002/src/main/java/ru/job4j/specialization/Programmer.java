package ru.job4j.specialization;
import ru.job4j.proftipe.Engineer;

public class Programmer extends Engineer {
    private String program;

    public Programmer (String name, String surname, String education, String birthday, String design, String program) {
        super(name, surname, education, birthday, design);
        this.program = program;
    }
    public String getProgram() {
        return this.program;
    }
}
