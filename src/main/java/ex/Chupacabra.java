package ex;

public class Chupacabra extends Cryptid {
    private String region;

    public Chupacabra(String name, int weight, String region) {
        this.region = region;
    }

    public Chupacabra() {
        this.region = "Ukrainian selo";
    }

    public void hunt() {
        System.out.println("Chupacabra hunts in the region " + region);
    }
}
