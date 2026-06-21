class Employee {

    String name;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.name = "Janani";
        emp.salary = 50000;

        emp.display();
    }
}