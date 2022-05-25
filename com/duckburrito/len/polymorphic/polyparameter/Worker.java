<<<<<<< HEAD
package com.duckburrito.len.polymorphic.polyparameter;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("work: " + getName() + " working");
    }

    public double getAnnual() {
        return super.getAnnual();
    }
}
=======
package com.duckburrito.len.polymorphic.polyparameter;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("work: " + getName() + " working");
    }

    public double getAnnual() {
        return super.getAnnual();
    }
}
>>>>>>> 76999c2b4b79451bbfa70ea24e42d09e95ebace6
