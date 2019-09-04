package ru.job4j.specialization;
import ru.job4j.proftipe.Doctor;

public class Surgeon extends Doctor {
    private String operation;

    public Surgeon (String name, String surname, String education, String birthday, String diagnosis, String operation) {
        super(name, surname, education, birthday, diagnosis);
        this.operation = operation;
    }
    public String getOperation() {
        return this.operation;
    }
}
