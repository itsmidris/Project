package EmployeeSalarySystem;

public class Main1 {

    public static void main(String[] args) {
        Employee emp = new Employee(76, "Imran",30000);

        emp.displayEmployee();

        emp.incrementSalary(10000);

        emp.displayEmployee();
    }
}
