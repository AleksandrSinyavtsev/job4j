package ru.job4j.specialization;
/**
 * @author Sinyavtsev Aleksandr.
 */

import ru.job4j.proftipe.Engineer;

public class Builder extends Engineer {
  private String buildAHouse;

  public Builder(String name, String surname,
                  String education, String birthday,
                  String design, String buildAHouse) {
    super(name, surname, education, birthday, design);
    this.buildAHouse = buildAHouse;
  }

  public String getBuildAHouse() {
    return this.buildAHouse;
  }
}

