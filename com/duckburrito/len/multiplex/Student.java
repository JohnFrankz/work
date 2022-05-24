package com.duckburrito.len.multiplex;

public class Student extends People{

    private int id;
    private double score;

    public Student(int id, double score) {
        this.id = id;
        this.score = score;
    }

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    Student() {

    }
}