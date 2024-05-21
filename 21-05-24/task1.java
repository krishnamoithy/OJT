import java.time.LocalDate;
import java.time.Period;


class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public int getYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(hireDate, currentDate).getYears();
    }
}

public class task1 {
    
    public static void main(String[] args) {
        Employee employee = new Employee("KRISHNAMOORTHY", 50000, LocalDate.of(2015, 5, 20));

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Hire Date: " + employee.getHireDate());
        System.out.println("Years of Service: " + employee.getYearsOfService());
    }
}
