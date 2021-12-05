package com.company.models;

public enum Department {
    GUILD ("цех"),
    STORE ("склад");

    private String department;

    Department(String department) {
        this.department = department;
    }

    public String getEnumDepartment() {
        return department;
    }

    public String getInfoDepartment() {
        return "место осуществления деятельности - " + department + ", ";
    }
}
