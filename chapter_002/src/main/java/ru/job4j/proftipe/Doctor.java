package ru.job4j.proftipe;

import ru.job4j.profession.Profession;

/**
 * Класс Doctor наследует Profession
 * и имеет свой метод getDiagnosis.
 */
public class Doctor extends Profession {
  private String diagnosis;

  public Doctor(String name, String surname, String education,
                String birthday, String diagnosis) {
    super(name, surname, education, birthday);
    this.diagnosis = diagnosis;
  }

  public String getDiagnosis() {
    return this.diagnosis;
  }
}


