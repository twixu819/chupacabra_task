package ex;

public class TestAnimal {
    public static void main(String[] args) {
        Chupacabra chupacabra = new Chupacabra("Yushka", 50, "Selo");

        chupacabra.eat();
        chupacabra.speak();
        chupacabra.hide();
        chupacabra.hunt();

        System.out.println(chupacabra.toString());
    }
}
