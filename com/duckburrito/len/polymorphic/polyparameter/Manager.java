package com.duckburrito.len.polymorphic.polyparameter;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manager() {
        System.out.println("manager: " + getName() + "is managing");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
