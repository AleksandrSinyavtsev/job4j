package ru.job4j.profession;
/**
 * Package for profession task.
 * @author Sinyavtsev Aleksandr.
 */


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

  public Profession(final String name, final String surname,
                    final String education, final String birthday) {
    this.name = name;
    this.surname = surname;
    this.education = education;
    this.birthday = birthday;
  }

  public final String getName() {
    return this.name;
  }

  public final String getSurname() {
    return this.surname;
  }

  public final String getEducation() {
    return this.education;
  }

  public final String getBirthday() {
    return this.birthday;
  }
}
