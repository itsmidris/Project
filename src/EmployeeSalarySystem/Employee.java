package EmployeeSalarySystem;
//    1. Show Employee Details
//    2. Increase Salary
//    3. Show Updated Details

public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary){
        this.employeeId=employeeId;
        this.name=name;
        this.salary=salary;
    }

    public void displayEmployee(){
        System.out.println("\nEmployee Details");
        System.out.println("ID: "+employeeId);
        System.out.println("Name " +name);
        System.out.println("Salary "+ salary);

    }

    public void incrementSalary(double amount){
        salary = salary + amount;

        System.out.println("Salary Increased by Rs. " + amount);
    }
}
