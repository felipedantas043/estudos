package mapa;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    private int numQuarto;

    public static Main m = new Main();
    public static Hotel hotel = new Hotel("Hotel cemEstrelas", "Rio Branco - AC");
    public static Scanner scan = new Scanner(System.in);

    public void escreve(String mensagem){
        System.out.println(mensagem);
    }
    public void sair(){
        m.escreve("Saindo...");
        System.exit(0);
        scan.close();
    }
    public void mapaI(){
        // Hotel hotel = new Hotel("Hotel Alto Bonito", "polo");
        // System.out.println(hotel.listarQuartos());

        // System.out.println(hotel.listarQuartos());

        // Reserva felipe = new Reserva(quarto1, "Felipe", 5);
        // System.out.println(felipe.calcularValor());
        // felipe.confirmarReserva();
        // quarto1.liberarQuarto();

        // Reserva jaine = new Reserva(quarto2, "Jaíne", 20);
        // System.out.println(jaine.calcularValor());
        // jaine.confirmarReserva();

        // System.out.println(hotel.searchQuarto(1));




        m.escreve("\n========================================\nBem vindo ao hotel");
        m.escreve("1-Listar quartos\n2-Adicionar quarto\n3-Remover quarto\n4-Procurar quarto \n\n5-Liberar quarto\n\n6-Reservar quarto\n\n0-Sair");


        int op = scan.nextInt();


        switch (op) {
            case 1:
                System.out.println(hotel.listarQuartos());

                main(null);
                break;
            case 2:
                m.escreve("Digite o numero do quarto a ser adicionado: ");
                m.numQuarto = scan.nextInt();
                m.escreve("Digite o preço da diária: ");
                double precoDiaria = scan.nextDouble();
                Quarto quarto = new Quarto(m.numQuarto, precoDiaria);
                hotel.addQuarto(quarto);
                m.escreve("Quarto adicionado!");
                System.out.print("Numero: "+ quarto.getNumero() + " preco da diaria: " + quarto.getPrecoDiaria());

                main(null);
                break;
            case 3:
                m.escreve("Digite o numero do quarto a ser removido: ");
                m.numQuarto = scan.nextInt();
                Quarto numRemQuarto = hotel.buscarQuarto(m.numQuarto);
                hotel.removeQuarto(numRemQuarto);

                m.escreve("Quarto Removido!");
                main(null);
                break;
            case 4:
                m.escreve("Digite o numero do quarto: ");
                m.numQuarto = scan.nextInt();

                break;
            case 0:
                m.sair();
                break;
            default:
                break;
        }
    }
    public static void main(String[] args){
        Teste teste = new Teste();
        System.out.println(teste.validarLocacao(400, 1500));
    }
}
