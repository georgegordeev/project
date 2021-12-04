package com.company.classes;

public class Developer extends Employee {

    private String language;
    private String university;
    private JavaDeveloper javaDeveloper;

    public Developer(String name, String surname, String language, String university, Long salary) {
        super(name, surname, Function.DEVELOPER, salary);
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
    public String function(Function function) {
        return function.getInfoFunction() + "язык разроботки - " + getLanguage() + ", ВУЗ - " + getUniversity() + ", ";
    }
}
