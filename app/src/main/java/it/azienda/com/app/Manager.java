package it.azienda.com.app;


public class Manager extends Employee{
    private double salary;

    public Manager(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
