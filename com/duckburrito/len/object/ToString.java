package com.duckburrito.len.object;

public class ToString {
    public static void main(String[] args) {
        Monster monster = new Monster("小妖怪", "xunsande", 20.0);
        System.out.println(monster.toString());
    }
}

class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }
}