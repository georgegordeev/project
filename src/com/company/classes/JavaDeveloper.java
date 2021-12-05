package com.company.classes;

public class JavaDeveloper extends Developer {
    private int experience;
    private String ide;

    public JavaDeveloper(String name, String surname, String university, int experience, String ide, Long salary) {
        super(name, surname, "Java", university, salary);
        this.experience = experience;
        this.ide = ide;
    }

    public int getExperience() {
        return experience;
    }

    public String getIde() {
        return ide;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String getInfoPosition(Position position) {
        return position.getStringPosition() + "язык разроботки - " + getLanguage() + ", ВУЗ - "
                + getUniversity() + ", стаж - " + experience + ", среда разработки - " + ide + ", ";
    }
}
