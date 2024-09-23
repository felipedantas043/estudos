package interfaces;

public class Retangulo implements AreaCalculavel{
    private double base, altura;
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calculaArea(){
        return base * altura;
    }
}
