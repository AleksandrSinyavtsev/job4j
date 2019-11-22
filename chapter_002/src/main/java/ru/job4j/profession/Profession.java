package ru.job4j.profession;
// @author Sinyavtsev Aleksandr.

public class Profession {
  private String name;
  private String surname;
  private String education;
  private String birthday;

  /**
   * Profession class.
   * @param name имя.
   * @param surname фамилия.
   * @param education образование.
   * @param birthday дата рождения.
   */
  public Profession(String name, String surname, String education, String birthday) {
    this.name = name;
    this.surname = surname;
    this.education = education;
    this.birthday = birthday;
  }

  public String getName() {
    return this.name;
  }

  public String getSurname() {
    return this.surname;
  }

  public String getEducation() {
    return this.education;
  }

  public String getBirthday() {
    return this.birthday;
  }
}