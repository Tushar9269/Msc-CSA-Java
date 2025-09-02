package accessSpecifier2;

import accessSpecifier.Animal;

public class Lion extends Animal {
    public void displayLion() {
        System.out.println("Protected Habitat: " + protectedHabitat);
        System.out.println("Public Sound: " + publicSound);
    }
}
