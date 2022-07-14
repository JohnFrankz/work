package com.duckburrito.len.debug_;

public class Debug05 {
    public static void main(String[] args) {
        Person jack = new Person("jack" ,20);
        System.out.println(jack);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}