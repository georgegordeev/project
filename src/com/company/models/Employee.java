package com.company.models;

public abstract class Employee {

    private String name;
    private String surname;
    private Position position;
    private Long salary;

    public Employee(String name, String surname, Position position, Long salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Position getPosition() {
        return position;
    }

    public Long getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    protected void setPosition(Position position) {
        this.position = position;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public abstract String getInfoPosition(Position position);

    public String getStringSalary(Long salary) {
        int penny = (int) (getSalary() % 100);
        String sPenny = penny + "";
        if (penny < 10) {
            sPenny = penny + "0";
        }
        return salary / 100 + "," + sPenny;
    }

    public String getInfo() {

        return getName() + " " + getSurname() + ": "
                + getInfoPosition(getPosition()) + "зарплата - " + getStringSalary(salary) + ".";
    }

}
