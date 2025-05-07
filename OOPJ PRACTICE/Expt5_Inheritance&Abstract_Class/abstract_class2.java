public class abstract_class2 {
    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        Instrument violin = new Violin();

        guitar.play();
        guitar.tune();

        violin.play();
        violin.tune();
    }
}

abstract class Instrument {
    abstract void play();

    abstract void tune();
}

class Guitar extends Instrument {
    void play() {
        System.out.println("Playing the guitar");
    }

    void tune() {
        System.out.println("Tuning the guitar");
    }
}

class Violin extends Instrument {
    void play() {
        System.out.println("Playing the violin");
    }

    void tune() {
        System.out.println("Tuning the violin");
    }
}