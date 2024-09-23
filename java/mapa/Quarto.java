package mapa;
public class Quarto {
    private int numero;
    private double precoDiaria;
    private boolean disponivel;

    public Quarto (int numero, double precoDiaria){
        this.numero = numero;
        this.precoDiaria = precoDiaria;
        this.disponivel = true;
    }

    public int getNumero(){
        return this.numero;
    }

    public double getPrecoDiaria(){
        return this.precoDiaria;
    }

    public boolean getDisponivel(){
        return this.disponivel;
    }
    public void reservar(){
        this.disponivel = false;
    }

    public void liberarQuarto(){
        if (!disponivel) {
            this.disponivel = true;
        }else{
            System.out.println("Quarto já está disponível!");
        }
    }
    @Override
    public String toString(){
        return "\nNúmero do quarto: " + this.getNumero() + " Diária: " + this.getPrecoDiaria() + " Status: " + this.getDisponivel();
    }

}
