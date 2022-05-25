<<<<<<< HEAD
package com.duckburrito.len.multiplex;

class Poppet {
    private int i;

    Poppet(int i) {
        this.i = i;
    }
}
public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;

    // Blank finals MUST be initialized in constructor
//    public BlankFinal() {
//        j = 1;
//        p = new Poppet(1);
//    }
//
//    public BlankFinal(int x) {
//        j = x;
//        p = new Poppet(x);
//    }

    {
        j = 1;
        p = new Poppet(1);
    }
    public static void main(String[] args) {
        new BlankFinal();
//        new BlankFinal(47);
    }
}
=======
package com.duckburrito.len.multiplex;

class Poppet {
    private int i;

    Poppet(int i) {
        this.i = i;
    }
}
public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;

    // Blank finals MUST be initialized in constructor
//    public BlankFinal() {
//        j = 1;
//        p = new Poppet(1);
//    }
//
//    public BlankFinal(int x) {
//        j = x;
//        p = new Poppet(x);
//    }

    {
        j = 1;
        p = new Poppet(1);
    }
    public static void main(String[] args) {
        new BlankFinal();
//        new BlankFinal(47);
    }
}
>>>>>>> 76999c2b4b79451bbfa70ea24e42d09e95ebace6
