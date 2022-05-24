package com.duckburrito.len.multiplex;

public class Pc extends Computer {
    private String brand;

    public Pc() {
    }

    public Pc(String brand) {
        this.brand = brand;
    }

    public Pc(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public void B() {
        this.A();
    }

    public String toString() {
        return "Pc{" +
                "brand='" + brand + '\'' +
                "} " + super.toString();
    }
}
