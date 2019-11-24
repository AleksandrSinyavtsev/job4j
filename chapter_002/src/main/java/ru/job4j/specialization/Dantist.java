package ru.job4j.specialization;
/**
 * @author Sinyavtsev Aleksandr.
 */

import ru.job4j.proftipe.Doctor;

public class Dantist extends Doctor {
  private String treatTooth;

  public Dantist(String name, String surname,
                 String education, String birthday,
                 String diagnosis, String treatTooth) {
    super(name, surname, education, birthday, diagnosis);
    this.treatTooth = treatTooth;
  }

  public String getTreatTooth() {
    return this.treatTooth;
  }
}

