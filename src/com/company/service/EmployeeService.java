package com.company.service;

import com.company.models.Employee;
import com.company.repository.EmployeeRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void getAllInfoAboutEmployees() {
        List<Employee> employeesAll = employeeRepository.createAndReturnEmployees();

        for (Employee someEmployee : employeesAll) {
            System.out.println(someEmployee.getInfo());
        }
    }

    public void getInfoAboutEmployeesSortedBySalary() {
        List<Employee> employeesSortedBySalary = employeeRepository.createAndReturnEmployees().stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());

        for (Employee someEmployee : employeesSortedBySalary) {
            String outString = someEmployee.getName() + " " + someEmployee.getSurname() + ": "
                    + "зарплата - " + someEmployee.getStringSalary(someEmployee.getSalary()) + ".";
            System.out.println(outString);
        }
    }
}
