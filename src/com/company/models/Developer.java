package com.company.models;

public class Developer extends Employee {

    private String language;
    private String university;
    private JavaDeveloper javaDeveloper;

    public Developer(String name, String surname, String language, String university, Long salary) {
        super(name, surname, Position.DEVELOPER, salary);
        this.language = language;
        this.university = university;
    }

    public String getLanguage() {
        return language;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String getInfoPosition(Position position) {
        return position.getStringPosition() + "язык разроботки - " + getLanguage() + ", ВУЗ - " + getUniversity() + ", ";
    }
}
