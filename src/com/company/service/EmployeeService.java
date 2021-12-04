package com.company.service;

import com.company.classes.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeService(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public EmployeeService(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void printAllEmployeesInfo() {
        for (Employee someEmployee : employeeList) {
            System.out.println(someEmployee.getInfo());
        }
    }

    public void printAllEmployeesNameSalary() {
        Collections.sort(employeeList);
        for (Employee someEmployee : employeeList) {
            String outString = someEmployee.getName() + " " + someEmployee.getSurname() + ": "
                    + "зарплата - " + someEmployee.getStringSalary(someEmployee.getSalary()) + ".";
            System.out.println(outString);
        }
    }
}
