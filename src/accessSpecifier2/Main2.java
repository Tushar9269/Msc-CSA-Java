package accessSpecifier2;

import accessSpecifier.Animal;

public class Main2 {
    public static void main(String[] args) {
        Animal a = new Animal();

        System.out.println("Accessing Animal from another package (non-subclass):");
        System.out.println("Public Sound: " + a.publicSound);

        System.out.println();

        Lion l = new Lion();
        System.out.println("Accessing from subclass in another package:");
        l.displayLion();
    }
}
