package ru.job4j.proftipe;
import ru.job4j.profession.Profession;

public class Engineer extends Profession {
    private String design;

    public Engineer(String name, String surname, String education, String birthday, String design) {
        super(name, surname, education, birthday);
        this.design = design;
    }
    public String getDesign () {
        return this.design;
    }
}
