package com.company.classes;

public abstract class Employee implements Comparable<Employee> {

    private String name;
    private String surname;
    private Function function;
    private Long salary;

    public Employee(String name, String surname, Function function, Long salary) {
        this.name = name;
        this.surname = surname;
        this.function = function;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Function getFunction() {
        return function;
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

    protected void setFunction(Function function) {
        this.function = function;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public abstract String function(Function function);

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
                + function(getFunction()) + "зарплата - " + getStringSalary(salary) + ".";
    }

    @Override
    public int compareTo(Employee e) {
        long dif = this.getSalary() - e.getSalary();
        if (dif == 0) {
            return 0;
        } else if (dif > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
