package com.duckburrito.len.object;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("baoma");
        bmw = null;
        System.gc();
        System.out.println("program exited.");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    protected void finalize() throws Throwable {
        System.out.println("we destroyed the car:" + name);
        System.out.println("some resources are released.");
    }
}
