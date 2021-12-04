package com.company.classes;

public class FitterEmployee extends Employee {

    private Department department;

    public FitterEmployee(String name, String surname, Department department, Long salary) {
        super(name, surname, Function.FITTER, salary);
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String function(Function function) {
        return function.getInfoFunction() + department.getInfoDepartment();
    }
}
