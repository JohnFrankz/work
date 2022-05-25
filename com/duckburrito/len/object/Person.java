<<<<<<< HEAD
package com.duckburrito.len.object;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Person) {
            Person person = (Person) obj;
            return this.name.equals(person.name) &&
                   this.age == person.age &&
                   this.gender == person.gender;
        }
        return false;
    }

    public static void main(String[] args) {
        Person persona = new Person("Tom", 18, "man");
        Person personb = new Person("Tom", 18, "man");
        Person personc = new Person("john", 20, "man");

        System.out.println(persona.equals(personc));
        System.out.println(persona.equals(personb));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
=======
package com.duckburrito.len.object;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Person) {
            Person person = (Person) obj;
            return this.name.equals(person.name) &&
                   this.age == person.age &&
                   this.gender == person.gender;
        }
        return false;
    }

    public static void main(String[] args) {
        Person persona = new Person("Tom", 18, "man");
        Person personb = new Person("Tom", 18, "man");
        Person personc = new Person("john", 20, "man");

        System.out.println(persona.equals(personc));
        System.out.println(persona.equals(personb));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
>>>>>>> 76999c2b4b79451bbfa70ea24e42d09e95ebace6
