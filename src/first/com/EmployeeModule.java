
package first.com;

public class EmployeeModule {

    int id;
    String name;
    double salary;

    public EmployeeModule(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        EmployeeModule emp =
            new EmployeeModule(101, "Vaishnavi", 45000);

        emp.displayEmployee();
    }
}
