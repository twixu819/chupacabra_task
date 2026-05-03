package ex;

public class Animal {
    private String name;
    private int weight;

    public Animal() {
        this.name = "Kokoska";
        this.weight = 48;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void speak() {
        System.out.println(name + " makes a sound");
    }

    public String toString() {
        return "Animal: " + name + "   Weight: " + weight;
    }
}
