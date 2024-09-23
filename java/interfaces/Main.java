package interfaces;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String args[]){
        AreaCalculavel quadrado1 = new Quadrado(25);
        AreaCalculavel retangulo1 = new Retangulo(15,10);
        AreaCalculavel circulo1 = new Circulo(12);

        List<AreaCalculavel> objetos;
        objetos = new ArrayList<>();
        objetos.add(retangulo1);
        objetos.add(quadrado1);
        System.out.println(objetos);

        JOptionPane.showMessageDialog(null, retangulo1.calculaArea(), "A Área é: ", 1);

    }
}

