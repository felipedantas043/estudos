package interfaces;

public class Quadrado implements AreaCalculavel{
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public double calculaArea() {
        return Math.pow(lado, 2);
    }
}
