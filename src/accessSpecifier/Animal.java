package accessSpecifier;

public class Animal {
    private String privateName = "Private Animal";
    String defaultType = "Default Animal";
    protected String protectedHabitat = "Forest";
    public String publicSound = "Roar";

    public void displayAnimal() {
        System.out.println("Inside Animal class:");
        System.out.println("Private Name: " + privateName);
        System.out.println("Default Type: " + defaultType);
        System.out.println("Protected Habitat: " + protectedHabitat);
        System.out.println("Public Sound: " + publicSound);
    }
}