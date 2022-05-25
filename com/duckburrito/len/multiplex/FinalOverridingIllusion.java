<<<<<<< HEAD
package com.duckburrito.len.multiplex;

class WithFinals {
    // Identical to "private" alone:
    private final void f() {
        System.out.println("WithFianals.f()");
    }

    // Also automatically "final"
    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
//     public final void f() { // if f() is public that Line 36 will Error: 'f()' can't override
//        System.out.println("OverridingPrivate.f()");
//    }

    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    public final void h() {

    }

    private void j() {

    }
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
//
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }

    public void g() {
        System.out.println("OVerridingPrivate2.g()");
    }
}
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

        OverridingPrivate op = new OverridingPrivate();


        op.h();
    }
}
=======
package com.duckburrito.len.multiplex;

class WithFinals {
    // Identical to "private" alone:
    private final void f() {
        System.out.println("WithFianals.f()");
    }

    // Also automatically "final"
    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
//     public final void f() { // if f() is public that Line 36 will Error: 'f()' can't override
//        System.out.println("OverridingPrivate.f()");
//    }

    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    public final void h() {

    }

    private void j() {

    }
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
//
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }

    public void g() {
        System.out.println("OVerridingPrivate2.g()");
    }
}
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

        OverridingPrivate op = new OverridingPrivate();


        op.h();
    }
}
>>>>>>> 76999c2b4b79451bbfa70ea24e42d09e95ebace6
