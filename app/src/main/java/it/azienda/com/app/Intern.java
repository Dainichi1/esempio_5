package it.azienda.com.app;

public class Intern extends Employee{
    private double stipend;

    public Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    @Override
    public double getSalary() {
        return stipend;
    }
}
