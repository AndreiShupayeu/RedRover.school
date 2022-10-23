package home_work6;

import home_work5.Person;
class TestEmployee{
    public static void main(String[] args) {
        Employee employee1=new Employee("Andrei",'M',1981,2000);
        Employee employee2=new Employee("Anna",'F',1979,150);
        System.out.println(employee1.isSameName(employee2));
    }
}

public class Employee extends Person {
    private double salary;

    public Employee(String name, char sex, int yearOfBirth, double salary) {
        super(name, sex, yearOfBirth);
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    public boolean isSameName(Employee employee) {
        return this.name.equals(employee.name);
    }
}
