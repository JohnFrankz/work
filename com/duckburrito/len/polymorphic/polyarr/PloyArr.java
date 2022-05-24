package com.duckburrito.len.polymorphic.polyarr;

public class PloyArr {
    public static void main(String[] args) {
        Person[] person = {
            new Person("jack", 20),
            new Student("Tom", 18, 87),
            new Student("Frk", 19, 67),
            new Teacher("white", 37, 7800),
            new Teacher("smith", 46, 9000),
        };

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].say());

            if(person[i] instanceof Student) {
                ((Student)person[i]).learn();
            } else if(person[i] instanceof Teacher) {
                ((Teacher)person[i]).teach();
            } else if(!(person[i] instanceof Person)){
                System.out.println("你的类型有误");
            }
        }
    }
}
