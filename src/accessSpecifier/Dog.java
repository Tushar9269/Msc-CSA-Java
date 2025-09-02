package accessSpecifier;

public class Dog extends Animal {
    public void displayDog() {
        System.out.println("Accessing from Dog class: ");
        System.out.println("Default Type: " + defaultType);
        System.out.println("Protected Habitat: " + protectedHabitat);
        System.out.println("Public Sound: " + publicSound);
    }
}
