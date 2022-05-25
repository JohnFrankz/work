<<<<<<< HEAD
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
=======
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
>>>>>>> 76999c2b4b79451bbfa70ea24e42d09e95ebace6
