package mapa;
public class Reserva {
    private Quarto quarto;
    private String nomeCliente;
    private int dias;

    public Reserva(Quarto quarto, String nomeCliente, int dias){
        this.quarto = quarto;
        this.nomeCliente = nomeCliente;
        this.dias = dias;
    }


    public double calcularValor(){
        if (dias > 10) {
            double diaria = quarto.getPrecoDiaria();
            return dias * (diaria-diaria*0.1);

        }
        return quarto.getPrecoDiaria() * dias;
    }

    public void confirmarReserva(){
        boolean disponivel = quarto.getDisponivel();
        if (disponivel) {
            quarto.reservar();
            System.out.println("Quarto reservado!");
        }else{
            System.out.println("Quarto não está disponível para reserva!");
        }
    }
}
