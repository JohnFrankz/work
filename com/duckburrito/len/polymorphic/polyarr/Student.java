package com.duckburrito.len.polymorphic.polyarr;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public String say() {
        return super.say() + "\tscore = " + score;
    }

    public void learn() {
        System.out.println("student: " + getName() + " learning");
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
