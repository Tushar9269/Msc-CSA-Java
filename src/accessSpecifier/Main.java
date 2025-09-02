package accessSpecifier;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.displayAnimal();

        System.out.println();

        Dog d = new Dog();
        d.displayDog();

        System.out.println();

        System.out.println("Accessing from Main class:");
        System.out.println("Default Type: " + a.defaultType);   // ✅ Accessible (same package)
        System.out.println("Protected Habitat: " + a.protectedHabitat); // ✅ Accessible
        System.out.println("Public Sound: " + a.publicSound);   // ✅ Accessible
    }
}
