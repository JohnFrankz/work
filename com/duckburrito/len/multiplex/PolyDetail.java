package com.duckburrito.len.multiplex;

public class PolyDetail {
    private A a = new B();
    void demo(A c) {
        System.out.println(c.number);
    }
    public static void main(String[] args) {
        PolyDetail pd = new PolyDetail();
        A c = new B();
        pd.a.f();
        System.out.println(pd.a.number);
        pd.demo(c);
    }
}

class A{
    int number =10;
    void f() {
        System.out.println("A.f()");
    }
}
class B extends A{
    int number = 20;
    @Override
    void f() {
        System.out.println("B.f()");
    }
}