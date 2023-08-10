package it.azienda.com.app;

public class Main {
    public static void main(String[] args) {
        HRDepartment<Manager> managerDept = new HRDepartment<>();
        managerDept.addEmployee(new Manager("Alice", 70000));
        managerDept.addEmployee(new Manager("Bob", 80000));

        System.out.println("Total salaries for managers: " + managerDept.totalSalaries());
        managerDept.printEmployeeNames();

        HRDepartment<Intern> internDept = new HRDepartment<>();
        internDept.addEmployee(new Intern("Charlie", 2000));
        internDept.addEmployee(new Intern("David", 2500));

        System.out.println("Total stipends for interns: " + internDept.totalSalaries());
        internDept.printEmployeeNames();
    }
}
