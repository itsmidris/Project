import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee implements Comparator {
    int id;
    String name;
    String dept;

    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public Employee() {
    }

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        return e1.id - e2.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        Employee e1 = new Employee(90, "Jyoti", "Unknown");
        Employee e2 = new Employee(88, "Pooja", "CA");
        Employee e3 = new Employee(82, "Imran", "Er.");

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        System.out.println(emp);

        Collections.sort(emp, new Employee());

        System.out.println(emp);
    }
}
