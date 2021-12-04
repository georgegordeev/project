package com.company.classes;

public enum Department {
    GUILD ("цех"),
    STORE ("склад");

    private String department;

    Department() {
    };

    Department(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getInfoDepartment() {
        return "место осуществления деятельности - " + department + ", ";
    }
}
