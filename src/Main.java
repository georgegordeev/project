import com.company.repository.EmployeeRepository;
import com.company.service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService(new EmployeeRepository());
        System.out.println("Вывод всей информации по всем сотрудникам");
        employeeService.getAllInfoAboutEmployees();
        System.out.println("Вывод списка сотрудников: ФИО и ЗП по возрастанию зарплаты");
        employeeService.getInfoAboutEmployeesSortedBySalary();
    }
}
