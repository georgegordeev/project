package com.company.repository;

import com.company.models.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Данный класс создан для имитации работы с БД
 */
public class EmployeeRepository {
    //Метод для создания и получения сотрудников, который позволяет сымитировать обращение к БД для получения сотрудников.
    public List<Employee> createAndReturnEmployees() {
        Employee fitter1 = new FitterEmployee("Иван", "Иванов", Department.GUILD, 2500000L);
        Employee fitter2 = new FitterEmployee("Петр", "Петров", Department.STORE, 2000000L);
        Employee stoneCutter1 = new StoneCutter("Вася", "Мощный", new int[] {1,2}, 4300043L);
        Employee developer1 = new Developer("Алексей", "Забавный", "Python", "МФТИ",8500000L);
        Employee javaDeveloper1 = new JavaDeveloper("Евгений", "Борисов", "МИСиС", 10, "IntellijIdea", 15000000L);

        List<Employee> employees = new ArrayList<>();
        employees.add(fitter1);
        employees.add(fitter2);
        employees.add(stoneCutter1);
        employees.add(developer1);
        employees.add(javaDeveloper1);

        return employees;
    }


}
