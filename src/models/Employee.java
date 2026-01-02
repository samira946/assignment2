package models;

public class Employee extends Person {
    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return getPosition();
    }

    public void getPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return this.salary;
    }

    public void getSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }

    private double salary;
    private String position;

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }
}