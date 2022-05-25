<<<<<<< HEAD
package com.duckburrito.len.polymorphic.music;

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting
    }
}
=======
package com.duckburrito.len.polymorphic.music;

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting
    }
}
>>>>>>> 76999c2b4b79451bbfa70ea24e42d09e95ebace6
