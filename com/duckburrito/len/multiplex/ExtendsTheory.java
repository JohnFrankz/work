package com.duckburrito.len.multiplex;

public class ExtendsTheory {

    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);
    }
}

class Grandpa {
    String name = "bigGrantpal";
    String hobby = "treave";
    Grandpa(){}
}

class father extends Grandpa {
    String name = "bigfather";
    int age = 39;
    father() {}
}

class Son extends father {
    String name = "bigSon";
    Son(){
//       this("hhh");
    }
//    Son(String name) {
//
//    }
}