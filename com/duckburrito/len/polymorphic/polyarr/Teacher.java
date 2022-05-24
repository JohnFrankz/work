package com.duckburrito.len.polymorphic.polyarr;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public String say() {
        return super.say() + "\tsalary= " + salary;
    }

    public void teach() {
        System.out.println("teacher: " + getName() + " teaching");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
