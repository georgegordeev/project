import com.company.classes.*;
import com.company.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee fitter1 = new FitterEmployee("Иван", "Иванов", Department.GUILD, 2500000L);
        Employee fitter2 = new FitterEmployee("Петр", "Петров", Department.STORE, 2000000L);
        Employee stoneCutter1 = new StoneCutter("Вася", "Мощный", new int[] {1,2}, 4300043L);
        Employee developer1 = new Developer("Алексей", "Забавный", "Python", "МФТИ",8500000L);
        Employee javaDeveloper1 = new JavaDeveloper("Евгений", "Борисов", "МИСиС", 10, "IntellijIdea", 15000000L);

        /*System.out.println(fitter1.getInfo());
        System.out.println(fitter2.getInfo());
        System.out.println(stoneCutter1.getInfo());
        System.out.println(developer1.getInfo());
        System.out.println(javaDeveloper1.getInfo());*/

        List<Employee> employees = new ArrayList<>();
        employees.add(fitter1);
        employees.add(fitter2);
        employees.add(stoneCutter1);
        employees.add(developer1);
        employees.add(javaDeveloper1);

        EmployeeService employeeService = new EmployeeService(fitter2);
        employeeService.printAllEmployeesInfo();
        employeeService.printAllEmployeesNameSalary();

        employeeService.setEmployeeList(employees);
        System.out.println("------------------------");
        employeeService.printAllEmployeesInfo();
        System.out.println("------------------------");
        employeeService.printAllEmployeesNameSalary();
    }
}
